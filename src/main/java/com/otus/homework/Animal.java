package com.otus.homework;

public class Animal {
    String name;
    String color;
    int age;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void say(){
        System.out.println("Я говорю");
    }

    public void go(){
        System.out.println("Я иду");
    }

    public void drink(){
        System.out.println("Я пью");
    }

    public void eat(){
        System.out.println("Я ем");
    }

    private String ageDeclination(){
        int age = getAge();

        switch (age % 10) {
            case 1:
                return "год";
            case 2:
            case 3:
            case 4:
                return "года";
            default:
                return "лет";
        }
    }

    @Override
    public String toString(){
        return "Привет! меня зовут " + getName() + ", мне " + getAge() + " " + ageDeclination() + ", я вешу - " + getWeight() + " кг, мой цвет - " + getColor();
    }

}
