package com.software.project.ServiceImplementation;

import java.util.List;

import com.software.project.Domain.User;
import com.software.project.Repository.UserRepository;
import com.software.project.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void DeleteById(int id) {
     //
        
    }
    @Override
    public void updateById(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User findbyId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
