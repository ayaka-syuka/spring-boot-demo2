package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Item;

@Controller
@RequestMapping("/each")

public class EachController {
    @RequestMapping("")
    public String index(Model model){

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("えんぴつ",120,"緑"));
        itemList.add(new Item("パソコン",198000,"シルバー"));
        itemList.add(new Item("水筒",2280,"白"));

     model.addAttribute("itemList", itemList);
     return "each";

    }

}
