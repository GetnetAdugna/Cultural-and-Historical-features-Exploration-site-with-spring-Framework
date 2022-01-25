package com.software.project.Repository;
import com.software.project.Domain.Culture;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CultureRepository  extends JpaRepository<Culture,Integer>{
    
}
