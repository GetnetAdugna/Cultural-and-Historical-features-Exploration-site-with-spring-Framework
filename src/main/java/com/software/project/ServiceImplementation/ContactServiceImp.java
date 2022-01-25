package com.software.project.ServiceImplementation;

import java.util.List;

import com.software.project.Domain.Contact;
import com.software.project.Service.ContactService;

import org.springframework.stereotype.Service;
@Service
public class ContactServiceImp implements ContactService {

    @Override
    public void DeleteById(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateById(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Contact findbyId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Contact> findAllContact() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
