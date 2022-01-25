package com.software.project.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CultureController {
  
    @GetMapping("/culture")
    public String toshow(){


        return null;
    }

    
}
