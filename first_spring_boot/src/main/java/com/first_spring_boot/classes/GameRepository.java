package com.first_spring_boot.classes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    // Custom query to find games by saga
    @Query("SELECT g FROM Game g WHERE g.saga.sagaId = :sagaId")
    List<Game> findBySagaId(Integer sagaId);
}
