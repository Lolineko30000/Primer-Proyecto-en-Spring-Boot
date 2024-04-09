package com.first_spring_boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.first_spring_boot.models.Game;
import com.first_spring_boot.services.GameService;
import java.util.List;


@RestController
@RequestMapping("/games")
public class GameServiceController {
    @Autowired
    private GameService gameService;
    
    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }
    
    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Integer id) {
        return gameService.getGameById(id);
    }
    
    @PostMapping
    public Game addGame(@RequestBody Game game) {
        return gameService.addGame(game);
    }
    
    @PutMapping("/{id}")
    public Game updateGame(@PathVariable Integer id, @RequestBody Game game) {
        return gameService.updateGame(id, game);
    }
    
    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable Integer id) {
        gameService.deleteGame(id);
    }
}