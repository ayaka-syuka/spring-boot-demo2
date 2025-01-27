
package com.example.demo2.controller;


import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/chat")
public class Ex16Controller {

    
    @Autowired
    private ServletContext application;


    @RequestMapping("")
    public String index(){
        List<User> userList = (List<User>) application.getAttribute("userList");
    if(userList == null){
            
            userList = new ArrayList<>();
            application.setAttribute("userList", userList);
        }


        return "ex-16";
    }

    @RequestMapping("/chat-page")
    public String post(@RequestParam("name") String name,@RequestParam("comment")String comment){

        List<User> userList = (List<User>) application.getAttribute("userList");


      
      userList.add(0,new User(name,comment));
        


        return "ex-16";

    }
}
