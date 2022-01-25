package com.software.project.Service;

import java.util.List;

import com.software.project.Domain.Contact;

public interface ContactService {

    public void DeleteById(int id);
    public void updateById(int id);
    public Contact findbyId(int id);
    public List<Contact> findAllContact();
    
}
