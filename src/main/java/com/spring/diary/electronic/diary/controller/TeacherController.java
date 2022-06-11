package com.spring.diary.electronic.diary.controller;

import com.spring.diary.electronic.diary.dao.TimeTableRepository;
import com.spring.diary.electronic.diary.dao.UserRepository;
import com.spring.diary.electronic.diary.entity.TimeTable;
import com.spring.diary.electronic.diary.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TimeTableRepository timeTableRepository;

    @GetMapping  ("/main")
    public String vie(Model model){
        //model.addAttribute("title", "first");
      Iterable<User> users=userRepository.findAll();
      model.addAttribute("users", users);
        //return "index";
       return "adminpage";
    }

    @GetMapping  ("/next")
    public String vieNext(Model model){
        //model.addAttribute("title", "first");
        Iterable<TimeTable> timeTables=timeTableRepository.findByGrade_IdOrderByDayOfWeek(5);
        model.addAttribute("timeTables", timeTables);
        //return "index";
        return "index";
    }
//    @PostMapping("/hello")
//    public String sayHello(@RequestParam("name") String name, Model model) {
//        model.addAttribute("name", name);
//        return "hello";
//    }
}
