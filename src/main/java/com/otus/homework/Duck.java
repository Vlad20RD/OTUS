package com.otus.homework;

public class Duck extends Animal implements Flying{
    @Override
    public void say(){
        System.out.println("Кря");
    }

    public void fly(){
        System.out.println("Я лечу");
    }

}
