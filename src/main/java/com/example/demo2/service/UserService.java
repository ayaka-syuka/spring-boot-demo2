package com.example.demo2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.domain.User2;
import com.example.demo2.form.UserForm;

@Service
public class UserService {

    public User2 save(User2 user){

        //引数で受け取った情報をusersテーブルにインサート
        // hobbysテーブルにインサート
        // メール送信

        System.out.println("UserServiceのsaveが呼ばれました");
        return user;  
    }

}