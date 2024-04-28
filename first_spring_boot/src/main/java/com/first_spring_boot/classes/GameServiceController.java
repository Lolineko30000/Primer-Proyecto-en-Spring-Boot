package com.first_spring_boot.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/game")
public class GameServiceController {

    @Autowired
    private GameService gameService;

    @GetMapping("/getAll")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("getGame/{id}")
    public Game getGameById(@PathVariable Integer id) {
        return gameService.getGameById(id);
    }


    @PostMapping("/games/addNewGame")
    public Game addNewGame(@RequestParam String title, @RequestParam String description, @RequestParam int year) {
        Game newGame = new Game();
        newGame.title = title;
        newGame.description = description;
        return gameService.addGame(newGame);
    }

    @PostMapping("/games/update/{id}")
    public Game updateGame(@PathVariable Integer id, @RequestBody Float score) {
        

        Game existingGame = gameService.getGameById(id);
        if (existingGame == null) {
            
            return null;
        }

        existingGame.score = score;
        return gameService.updateGame(id, existingGame);
    }

    @PostMapping("/delete/{id}")
    public void deleteGame(@PathVariable Integer id) {
        gameService.deleteGame(id);
    }

}
