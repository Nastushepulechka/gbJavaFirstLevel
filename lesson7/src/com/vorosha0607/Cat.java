package com.vorosha0607;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    void eat(Plate plate){
        isCatSatiated(plate);
        plate.decreaseFood(appetite);
    }

    private void isCatSatiated(Plate plate){
        if (this.appetite < plate.getFood()) {
            this.satiety = true;
            System.out.println("Кот " + this.name +  " поел");
        }
        else System.out.println("Коту " + this.name + " не хватило еды");
    }

    public boolean getSatiety(){
        return satiety;
    }


}
