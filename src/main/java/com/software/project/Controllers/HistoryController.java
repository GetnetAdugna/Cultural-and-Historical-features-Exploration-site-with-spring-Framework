package com.software.project.Controllers;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.software.project.Domain.History;
import com.software.project.Repository.HistoryRepository;
import com.software.project.Service.HistoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class HistoryController {
  @Autowired
    HistoryService historyService;
  @Autowired
  HistoryRepository historyRepository;
    
    @GetMapping("/history")
    public String main(Model model){
        List<History> histories=historyService.findAllHistory();
        model.addAttribute("histories", histories);
        return "history";
    }
    // @GetMapping("/history")
    // public String clickedPage(Model model){
    //     List<History> histories=historyService.findAllHistory();
    //     model.addAttribute("histories", histories);
      @GetMapping("/history/add")
      public String  getIMage(@RequestParam("file") MultipartFile file) throws IOException {
        byte[] fileData = file.getBytes();
        History history = new History();
        history.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque nisl eros pulvinar facilisis justo mollis, auctor consequat urna. Morbi a bibendum metus.  Donec scelerisque sollicitudin enim eu venenatis. Duis tincidunt laoreet e in pretium orci vestibulum eget. Class aptent taciti sociosqu ad litora torquentper conubia nostra, per inceptos himenaeos. Duis pharetra luctus lacus ut vestibulum. Maecenas ipsum lacus, lacinia quis posuere ut, pulvinar vitae dolor.Integer eu nibh at nisi ullamcorper sagittis id vel leo. Integer feugiat faucibus libero, at maximus nisl suscipit posuere. Morbi nec enim nunc. Phasellus bibendum turpis ut ipsum egestas, sed sollicitudin elit convallis. Cras pharetra mi tristique sapien vestibulum lobortis. Nam eget bibendum metus, non dictum mauris. Nulla at tellus sagittis, viverra est a, bibendum metus.");
        history.setTitle("my history");
        history.setLocation("addis ababa");
        history.setYearElapsed("2012/2/3");
        history.setImgData(fileData);
        historyRepository.save(history);
        return "history";
         
      }
      
      {

      }



   
}
