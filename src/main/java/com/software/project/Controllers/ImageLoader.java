package com.software.project.Controllers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.software.project.Domain.History;
import com.software.project.Repository.HistoryRepository;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ImageLoader {
    @Autowired
    HistoryRepository historyRepository;
    @GetMapping("/gettest")
    public String getTest(Model model){
        // History hist = historyRepository.findById(1).get
        List<History> hists = historyRepository.findAll();
        // System.out.println(hist);
        model.addAttribute("hists", hists);
        return "test";



    }

    @GetMapping("/img/history/{id}")
    public void getImage(@PathVariable("id") int id,HttpServletResponse response) throws IOException{

        // response.setContentType("imeg/jpg");
        History hi= historyRepository.findById(id).get();
        InputStream in = new ByteArrayInputStream(hi.getImgData());
        IOUtils.copy(in, response.getOutputStream());

    }
    @GetMapping("/img/culture/{id}")
    public void getCultureImage(@PathVariable("id") int id,HttpServletResponse response) throws IOException{
    
        // response.setContentType("imeg/jpg");
        History hi= historyRepository.findById(id).get();
        InputStream in = new ByteArrayInputStream(hi.getImgData());
        IOUtils.copy(in, response.getOutputStream());

    }
    @GetMapping("/img/site/{id}")
    public void getSiteImage(@PathVariable("id") int id,HttpServletResponse response) throws IOException{
        // response.setContentType("imeg/jpg");
        History hi= historyRepository.findById(id).get();
        InputStream in = new ByteArrayInputStream(hi.getImgData());
        IOUtils.copy(in, response.getOutputStream());

    }
    
}
