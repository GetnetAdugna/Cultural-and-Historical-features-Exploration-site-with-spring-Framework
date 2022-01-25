package com.software.project.Controllers;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.software.project.Domain.Content;
import com.software.project.Repository.ContentRepository;
import com.software.project.Service.ContentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class ContentController {
  @Autowired
  ContentService contentService;
    
    @GetMapping("/content/getAll/{type}")
    public String findContentByType(Model model, @PathVariable("type") String type){
      List<Content> contents;
      if(type.equals("HISTORY")){
        contents = contentService.findAllHistory();
      }
      else if(type.equals("SITE")){
        contents = contentService.findAllSites();
      }
       else{
        contents = contentService.findAllCulture();
       }

       model.addAttribute("contents", contents);

       return "content";


     
    }

    // @GetMapping("/history")
    // public String main(Model model){
    //     List<Content> histories=historyService.findAllHistory();
    //     model.addAttribute("histories", histories);
    //     return "history";
    // }






    // @GetMapping("/history")
    // public String clickedPage(Model model){
    //     List<History> histories=historyService.findAllHistory();
    //     model.addAttribute("histories", histories);
      // @GetMapping("/history/add")
      // public String  getIMage(@RequestParam("file") MultipartFile file) throws IOException {
      //   byte[] fileData = file.getBytes();
      //   Content history = new Content();
      //   history.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nisl eros pulvinar facilisis justo mollis, auctor consequat urna. Morbi a bibendum metus.  Donec scelerisque sollicitudin enim eu venenatis. Duis tincidunt laoreet e in pretium orci vestibulum eget. Class aptent taciti sociosqu ad litora torquentper conubia nostra, per inceptos himenaeos. Duis pharetra luctus lacus ut vestibulum. Maecenas ipsum lacus, lacinia quis posuere ut, pulvinar vitae dolor.Integer eu nibh at nisi ullamcorper sagittis id vel leo. Integer feugiat faucibus libero, at maximus nisl suscipit posuere. Morbi nec enim nunc. Phasellus bibendum turpis ut ipsum egestas, sed sollicitudin elit convallis. Cras pharetra mi tristique sapien vestibulum lobortis. Nam eget bibendum metus, non dictum mauris. Nulla at tellus sagittis, viverra est a, bibendum metus.");
      //   history.setTitle("my history");
      //   history.setLocation("addis ababa");
      //   history.setYearElapsed("2012/2/3");
      //   history.setImgData(fileData);
      //   historyRepository.save(history);
      //   return "history";
         
      // }
     



   
}
