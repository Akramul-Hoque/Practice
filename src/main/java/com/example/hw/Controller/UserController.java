package com.example.hw.Controller;

import com.example.hw.Model.User;
import com.example.hw.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public ModelAndView home(){
        List<User> users = userRepository.findAll();
        ModelAndView mav = new ModelAndView("page");
        mav.addObject("users",users);
        return mav;

    }

    @GetMapping("/log")
    public String log(){
        return "log";
    }
    @PostMapping("/add")
    public String adduser(User user){
        User user1 =userRepository.save(user);
        return "redirect:/";

    }
    @GetMapping("/delete/{id}")
        public String deleteUser(@PathVariable int id){
       // userRepository.deleteAllById(Collections.singleton(id));
        userRepository.deleteById(id);
        return "user deleted";
        }
}
