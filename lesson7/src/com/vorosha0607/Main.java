package com.vorosha0607;

public class Main {

    public static void main(String[] args) {

        Cat arrayCat[] = new Cat[8];
        arrayCat[0] = new Cat("Пуся", 7);
        arrayCat[1] = new Cat("Муся", 3);
        arrayCat[2] = new Cat("Дуся", 4);
        arrayCat[3] = new Cat("Куся", 5);
        arrayCat[4] = new Cat("Луся", 6);
        arrayCat[5] = new Cat("Нуся", 4);
        arrayCat[6] = new Cat("Жуся", 8);
        arrayCat[7] = new Cat("Цуся", 2);
        Plate plate = new Plate(20);


        plate.printInfo();
        for (int i = 0; i < 8; i++) {
            arrayCat[i].eat(plate);
        }
        System.out.println();

        //Это не по заданию, просто развлекаюсь, попытка докормить голодных котов
        plate.addFood(20);
        for (int i = 0; i < 8; i++) {
            if (!arrayCat[i].getSatiety())
                arrayCat[i].eat(plate);
        }

    }
}
