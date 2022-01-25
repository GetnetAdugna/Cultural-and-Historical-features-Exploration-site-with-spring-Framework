package com.software.project.Service;

import java.util.List;

import com.software.project.Domain.Content;

public interface ContentService {
    public void DeleteById(int id);
    public void updateById(int id,Content history);
    public Content findbyId(int id);
    public List<Content> findAllHistory();
    public List<Content> findAllCulture();
    public List<Content> findAllSites();
    
}
