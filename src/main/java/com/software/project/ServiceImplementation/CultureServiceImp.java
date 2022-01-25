package com.software.project.ServiceImplementation;

import java.util.List;

import com.software.project.Domain.Culture;
import com.software.project.Repository.CultureRepository;
import com.software.project.Service.CultureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CultureServiceImp  implements CultureService{
    @Autowired
    CultureRepository cultureRepository;

    @Override
    public void deleteById(int id) {
        if(cultureRepository.existsById(id)){
        cultureRepository.deleteById(id);
        }
        else{
            throw new  RuntimeException("the culutre with id "+id+"is not found");
        }
         
     }
    
        
    

    @Override
    public void updateById(int id,Culture culture) {
        if(cultureRepository.existsById(id)){
            Culture oldCulutre=cultureRepository.findById(id).get();
            oldCulutre=culture;
            cultureRepository.save(oldCulutre);
 
 
         }
         else{
             throw new RuntimeException("The  culuture with "+id+" that you are trying to get is not found ");
         }
      
        
    }

    @Override
    public Culture findbyId(int id) {
    
        if(cultureRepository.existsById(id)){
            return  cultureRepository.findById(id).get();
        }
        else{
            throw new RuntimeException("The gallary object with "+id+" that you are trying to get is not found ");
          
        }
    }

    @Override
    public List<Culture> findAllCulture() {
    
        return cultureRepository.findAll();
    }




 
    
}
