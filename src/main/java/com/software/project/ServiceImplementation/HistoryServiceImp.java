package com.software.project.ServiceImplementation;

import java.util.List;

import com.software.project.Domain.History;
import com.software.project.Repository.HistoryRepository;
import com.software.project.Service.HistoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HistoryServiceImp implements HistoryService {
    @Autowired
    HistoryRepository historyRepository;

    @Override
    public void DeleteById(int id) {
       if(historyRepository.existsById(id)){
           historyRepository.deleteById(id);
       }
       else{
           throw new  RuntimeException("the history with id "+id+"is not found");
       }
        
    }

    @Override
    public void updateById(int id, History history) {
        if(historyRepository.existsById(id)){
            History oldHistory=historyRepository.findById(id).get();
            oldHistory=history;
            historyRepository.save(oldHistory);
 
 
         }
         else{
             throw new RuntimeException("The  history with "+id+" that you are trying to get is not found ");
         }
      
        
    }

    @Override
    public History findbyId(int id) {
        if(historyRepository.existsById(id)){
            return  historyRepository.findById(id).get();
        }
        else{
            throw new RuntimeException("The gallary object with "+id+" that you are trying to get is not found ");
          
        }
     
       
    }

    @Override
    public List<History> findAllHistory() {

        return historyRepository.findAll();
    }


    
}
