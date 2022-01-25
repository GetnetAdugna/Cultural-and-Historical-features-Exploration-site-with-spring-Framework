package com.software.project.Service;

import java.util.List;

import com.software.project.Domain.User;

public interface UserService {
    public void DeleteById(int id);
    public void updateById(int id);
    public User findbyId(int id);
    public List<User> findAllUsers();
    
}
