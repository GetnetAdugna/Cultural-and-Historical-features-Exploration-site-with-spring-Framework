package com.software.project.Service;

import java.util.List;

import com.software.project.Domain.Sites;

public interface SiteService {
    public void DeleteById(int id);
    public void updateById(int id,Sites site);
    public Sites findbyId(int id);
    public List<Sites> findAllSites();
    
}
