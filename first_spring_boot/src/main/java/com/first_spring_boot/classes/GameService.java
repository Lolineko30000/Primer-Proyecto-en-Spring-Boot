package com.first_spring_boot.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public Game addGame(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Integer gameId, Game updatedGame) {
        if (!gameRepository.existsById(gameId)) {
            return null;
        }
        Game existingGame = gameRepository.getReferenceById(gameId);
        return gameRepository.save(existingGame);
    }

    public void deleteGame(Integer gameId) {
        if (!gameRepository.existsById(gameId)) {
            return;
        }        
        gameRepository.deleteById(gameId);
    }

}
