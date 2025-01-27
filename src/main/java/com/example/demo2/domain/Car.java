package com.example.demo2.domain;

public class Car {

    private int speed;
    private String name;
    private int gus;
    
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getGus() {
        return gus;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

    public Car() { //引数なしのコンストラクタ
    }

    public Car(int speed, String name, int gus) {
        this.speed = speed;
        this.name = name;
        this.gus = gus;
    }

    

}
