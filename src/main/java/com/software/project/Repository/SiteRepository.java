package com.software.project.Repository;

import com.software.project.Domain.Sites;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepository  extends JpaRepository<Sites,Integer>{
    
}
    

