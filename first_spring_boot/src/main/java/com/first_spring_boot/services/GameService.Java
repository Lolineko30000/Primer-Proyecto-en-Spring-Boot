package com.first_spring_boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.first_spring_boot.repositories.GameRepository;
import com.first_spring_boot.models.Game;
import java.util.List;


@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
    
    public Game getGameById(Integer id) {
        return gameRepository.findById(id).orElse(null);
    }
    
    
}
