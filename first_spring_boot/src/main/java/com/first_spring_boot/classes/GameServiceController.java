package com.first_spring_boot.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class GameServiceController {
    
    @Autowired
    private GameService gameService;
    
    @GetMapping("/games/getAll")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }
    
    @GetMapping("/games/{id}")
    public Game getGameById(@PathVariable Integer id) {
        return gameService.getGameById(id);
    }
    
    @PostMapping("/games/add")
    public Game addGame(@RequestBody Game game) {
        return gameService.addGame(game);
    }
    
    @PutMapping("games/{id}")
    public Game updateGame(@PathVariable Integer id, @RequestBody Game game) {
        return gameService.updateGame(id, game);
    }
    
    @DeleteMapping("games/{id}")
    public void deleteGame(@PathVariable Integer id) {
        gameService.deleteGame(id);
    }
}