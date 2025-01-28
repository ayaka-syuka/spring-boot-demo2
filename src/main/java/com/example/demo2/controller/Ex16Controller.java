
package com.example.demo2.controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo2.domain.Users;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/chat")
public class Ex16Controller {

    
    @Autowired
    private ServletContext application;


    @RequestMapping("")
    public String index(){
        @SuppressWarnings("unchecked")
        List<Users> userList = (List<Users>) application.getAttribute("userList");
    if(userList == null){
            
            userList = new ArrayList<>();
            application.setAttribute("userList", userList);
        }


        return "ex-16";
    }

    @RequestMapping("/chat-page")
    public String post(String name,String comment){
        @SuppressWarnings("unchecked")
        List<Users> userList = (List<Users>) application.getAttribute("userList");



      
      userList.add(0,new Users(name,comment));
        


        return "ex-16";

    }
}
