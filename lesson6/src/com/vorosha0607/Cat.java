package com.vorosha0607;

public class Cat extends Animal{
    String name;
    String color;
    int age;

    Cat(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void run(int distance){
        if (distance < 200 && distance > 0)
            System.out.println(name + " пробежал " + distance + " метров");
        else System.out.println("Кошки не умеют бежать на такую дистанцию, только 0-200 метров");
    }

    void swim(int distance){
        System.out.println("Кошки не умеют плавать");
    }
}
