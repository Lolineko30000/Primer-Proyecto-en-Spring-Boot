package com.first_spring_boot.classes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlatformRepository extends JpaRepository<Platform, Integer> {
    @Query("SELECT p FROM Platform p WHERE LOWER(p.name) LIKE %:keyword%")
    List<Platform> findByNameContainingIgnoreCase(String keyword);
}
