package com.example.jenkins.repository;

import com.example.jenkins.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<Board, Long> {

    @Query(value = "select now()", nativeQuery = true)
    public String test();
}
