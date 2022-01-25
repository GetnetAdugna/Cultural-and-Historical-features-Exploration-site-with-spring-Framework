package com.software.project.Controllers;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.software.project.Domain.Content;
import com.software.project.Repository.ContentRepository;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



@Controller
public class ImageLoader {
    @Autowired
    ContentRepository historyRepository;
    @GetMapping("/gettest")
    public String getTest(Model model){
        // History hist = historyRepository.findById(1).get
        List<Content> hists = historyRepository.findAll();
        // System.out.println(hist);
        model.addAttribute("hists", hists);
        return "test";



    }

    @GetMapping("/img/history/{id}")
    public void getImage(@PathVariable("id") int id,HttpServletResponse response) throws IOException{

        // response.setContentType("imeg/jpg");
        Content hi= historyRepository.findById(id).get();
        InputStream in = new ByteArrayInputStream(hi.getImgData());
        IOUtils.copy(in, response.getOutputStream());

    }
    @GetMapping("/img/culture/{id}")
    public void getCultureImage(@PathVariable("id") int id,HttpServletResponse response) throws IOException{
    
        // response.setContentType("imeg/jpg");
        Content hi= historyRepository.findById(id).get();
        InputStream in = new ByteArrayInputStream(hi.getImgData());
        IOUtils.copy(in, response.getOutputStream());

    }
    @GetMapping("/img/site/{id}")
    public void getSiteImage(@PathVariable("id") int id,HttpServletResponse response) throws IOException{
        // response.setContentType("imeg/jpg");
        Content hi= historyRepository.findById(id).get();
        InputStream in = new ByteArrayInputStream(hi.getImgData());
        IOUtils.copy(in, response.getOutputStream());

    }
    @GetMapping("/upload")
    public String  getUplaodContent( Model model){
        Content newHist = new Content();
        model.addAttribute("contentHolder", newHist);

        return "fileUploader";
        

    }

    @PostMapping("/upload")
    public String uplaodContent(@RequestParam("picture") MultipartFile imgFile,@ModelAttribute("contentHolder") Content history ) throws IOException{
        Content newHist = new Content();
        newHist.setContent(history.getContent());
        newHist.setTitle(history.getTitle());
        newHist.setYearElapsed(history.getYearElapsed());
        byte[] imgData = imgFile.getBytes();
        newHist.setImgData(imgData);
        newHist.setLocation("Addis Ababa");
        historyRepository.save(newHist);
        return "index";
        

    }
    
}
