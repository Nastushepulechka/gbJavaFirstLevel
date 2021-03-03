package com.vorosha0607;

public class Dog extends Animal{

    String name;
    String breed;
    int age;

    Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    void run(int distance){
        if (distance < 500 && distance > 0)
            System.out.println(name + " пробежал " + distance + " метров");
        else System.out.println("Собаки не умеют бежать на такую дистанцию, только 0-500 метров");
    }

    void swim(int distance){
        if (distance < 10  && distance > 0)
            System.out.println(name + " проплыл " + " м");
        else System.out.println("Собаки не умеют плыть на такую дистанцию, только 0-10 метров");
    }
}
