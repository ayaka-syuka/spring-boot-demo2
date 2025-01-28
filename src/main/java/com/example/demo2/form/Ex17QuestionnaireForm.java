package com.example.demo2.form;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Ex17QuestionnaireForm {

    @NotBlank(message="値を入力してください")
    @Size(min=1, max=127,message="1桁以上127桁以下で入力してください")
    private String name;

    @Size(min=1, max=127,message="1桁以上127桁以下で入力してください")
    @Email(message="Eメールの形式が不正です")
    private String email;
    
    @NotEmpty(message = "値を入力してください")
    private List<Integer> genderList;

    @NotEmpty(message = "値を入力してください")
    private List<Integer> hobbyList;

    private List<Integer> languageList;

   
    @Size(min=1, max=2000,message="1桁以上2000桁以下で入力してください")
    private String textarea;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public List<Integer> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public List<Integer> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<Integer> languageList) {
        this.languageList = languageList;
    }

    public String getTextarea() {
        return textarea;
    }

    public void setTextarea(String textarea) {
        this.textarea = textarea;
    }

    public List<Integer> getGenderList() {
        return genderList;
    }

    public void setGenderList(List<Integer> genderList) {
        this.genderList = genderList;
    }

    


}
