package com.first_spring_boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.first_spring_boot.models.Platform;
import java.util.List;


public interface PlatformRepository extends JpaRepository<Platform, Integer> {
    @Query("SELECT p FROM Platform p WHERE LOWER(p.name) LIKE %:keyword%")
    List<Platform> findByNameContainingIgnoreCase(String keyword);
}
