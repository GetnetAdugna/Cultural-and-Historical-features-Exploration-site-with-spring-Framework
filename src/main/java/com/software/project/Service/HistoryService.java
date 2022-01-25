package com.software.project.Service;

import java.util.List;

import com.software.project.Domain.History;

public interface HistoryService {
    public void DeleteById(int id);
    public void updateById(int id,History history);
    public History findbyId(int id);
    public List<History> findAllHistory();
    
}
