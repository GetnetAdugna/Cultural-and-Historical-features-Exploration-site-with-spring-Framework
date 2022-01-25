package com.software.project.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {
    @GetMapping("/site")
    public String toshow(){


        return null;
    }
    
}
