package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Car;

@Controller
@RequestMapping("/variable-expressions")

public class VariableExpressionController {

    @RequestMapping("")
    public String index(Model model){  //リクエストスコープ
        
        model.addAttribute("name","かたふち");

        Car car = new Car(100,"ベンツ",50);
        model.addAttribute("car", car); //ここの"car"は自分で名づける

        return "variable-expressions";
        
    }
}
