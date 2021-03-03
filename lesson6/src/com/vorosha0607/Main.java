package com.vorosha0607;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Дуська", "цветная", 5);
        Cat cat2 = new Cat("Муся", "черно-белая", 9);

        Dog dog1 = new Dog("Путти", "Долматинец", 4);
        Dog dog2 = new Dog("Хенсон", "Овчарка", 5);

        cat1.swim(5);
        dog2.run(350);
    }
}
