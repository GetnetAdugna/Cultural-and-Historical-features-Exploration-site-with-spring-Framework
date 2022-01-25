package com.software.project.Repository;

import com.software.project.Domain.History;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History,Integer> {
    
}
