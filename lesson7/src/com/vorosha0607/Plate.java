package com.vorosha0607;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void printInfo(){
        System.out.println("В тарелке " + food + " единиц еды");
    }

    void decreaseFood(int appetite){
        if (appetite > food)
            return;
        this.food -= appetite;
    }

    int getFood(){
        return food;
    }

    public void addFood(int newFood){
        this.food += newFood;
    }
}
