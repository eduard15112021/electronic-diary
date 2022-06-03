package com.spring.diary.electronic.diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {

    @GetMapping  ("/main")
    public String vie(Model model){
     //   model.addAttribute("title", "first");
      //return "index";
       return "qwerty";
    }

//    @PostMapping("/hello")
//    public String sayHello(@RequestParam("name") String name, Model model) {
//        model.addAttribute("name", name);
//        return "hello";
//    }
}
