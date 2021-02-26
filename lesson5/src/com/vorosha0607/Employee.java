package com.vorosha0607;

public class Employee {

    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int salary;
    public int age;

    public Employee(){
        fullName = "Иванов Иван Иванович";
        post = "зам начальник ИТ-отдела";
        email = "ivanovI@mail.ru";
        phone = "+7(999)999-99-99";
        salary = 225000;
        age = 36;
    }

    public Employee(String fullName, String post, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void consoleOutput(){
        System.out.println("ФИО сотрудника: " + fullName);
        System.out.println("Должность сотрудника: " + post);
        System.out.println("Email сотрудника: " + email);
        System.out.println("Телефон сотрудника: " + phone);
        System.out.println("Зарплата сотрудника: " + salary);
        System.out.println("Возраст сотрудника: " + age);
        System.out.println();
    }
}
