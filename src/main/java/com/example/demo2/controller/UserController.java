package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.domain.User2;
import com.example.demo2.form.UserForm;
import com.example.demo2.service.UserService;

@Controller
@RequestMapping("/user")

public class UserController {

    @ModelAttribute
    public UserForm setUpForm(){
        return new UserForm();
    }

    @RequestMapping("")
    public String index(Model model){

        Map<Integer,String> hobbyMap = new LinkedHashMap<>();
        hobbyMap.put(1,"野球");
        hobbyMap.put(2,"サッカー");
        hobbyMap.put(3,"テニス");
        hobbyMap.put(4,"水泳");

        model.addAttribute("hobbyMap",hobbyMap);

        return "user/input"; //userフォルダの中のinput htmlの名前自体はinput
    }

    @RequestMapping("/create")
    public String create(
        @Validated UserForm form
        ,BindingResult result
        ,RedirectAttributes redirectAttributes
        ,Model model
    ){
        if(result.hasErrors()){
            return index(model);
        }

        User2 user2 = new User2();
        BeanUtils.copyProperties(form, user2);

        List<String> hobbyList = new ArrayList<>();
        for(Integer hobbyCode:form.getHobbyList()){
            switch(hobbyCode){
                case 1:
                hobbyList.add("野球");
                break;
                case 2:
                hobbyList.add("サッカー");
                break;
                case 3:
                hobbyList.add("テニス");
                break;
                case 4:
                hobbyList.add("水泳");
                break;
                

            }
        }

        user2.setHobbyList(hobbyList);
        UserService userService = new UserService();
        user2 = userService.save(user2);

        redirectAttributes.addFlashAttribute("user2",user2);

        return "redirect:/user/toresult";
    }

    @RequestMapping("/toresult")
    public String toresult(){
        return "user/result";
    }

}



