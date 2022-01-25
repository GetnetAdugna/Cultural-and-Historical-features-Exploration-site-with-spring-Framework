package com.software.project.Service;

import java.util.List;

import com.software.project.Domain.Culture;

public interface CultureService {
    public void deleteById(int id);

    public void updateById(int id,Culture culture);

    public Culture findbyId(int id);
    public List<Culture> findAllCulture();
    
}
