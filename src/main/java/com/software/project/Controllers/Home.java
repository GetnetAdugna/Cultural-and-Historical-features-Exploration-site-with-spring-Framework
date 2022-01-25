package com.software.project.Controllers;

import java.util.List;

import com.software.project.Domain.Gallary;
import com.software.project.Repository.GallaryRepository;
import com.software.project.Service.GallaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @Autowired

    GallaryService gallaryService;
  
    @GetMapping("/")
    public String toshowHome(Model themodel){
        System.out.println("mapped");


        return "Home";
    }
    
    @GetMapping("/map")
    public String toshowMap(){


        return null;
    }
    @GetMapping("/gallary")
    public String toshow(Model theModel){
        List<Gallary> images=gallaryService.findAllGallary();
        theModel.addAttribute("Gallary", images);


        return null;
    }

}
