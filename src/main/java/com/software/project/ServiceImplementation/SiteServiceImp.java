package com.software.project.ServiceImplementation;

import java.util.List;

import com.software.project.Domain.Sites;
import com.software.project.Repository.SiteRepository;
import com.software.project.Service.SiteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SiteServiceImp implements SiteService {
    @Autowired 
    SiteRepository siteRepository;

    @Override
    public void DeleteById(int id) {
        if(siteRepository.existsById(id)){
            siteRepository.deleteById(id);
        }
        
    }

    @Override
    public void updateById(int id,Sites sites) {
      if(siteRepository.existsById(id)){
          siteRepository.save(sites);
      }
        
    }

    @Override
    public Sites findbyId(int id) {
        if(siteRepository.existsById(id)){
            return siteRepository.findById(id).get();
        }else{
            return null;
        }
    }

    @Override
    public List<Sites> findAllSites() {
        return siteRepository.findAll();
    }
    
}
