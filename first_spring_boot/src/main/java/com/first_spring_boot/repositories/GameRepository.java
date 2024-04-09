package com.first_spring_boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.first_spring_boot.models.Game;
import java.util.List;


public interface GameRepository extends JpaRepository<Game, Integer> {
    // Custom query to find games by saga
    @Query("SELECT g FROM Game g WHERE g.saga.sagaId = :sagaId")
    List<Game> findBySagaId(Integer sagaId);
}
