package com.vorosha0607;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Предалагаю сыграть в игру. Компьютер загадает слово по теме 'Еда' на английском, " +
                "а тебе нужно попробовать его угадать. Не беспокойся, будут подсказки! Начинаем!");
        guessTheWord();
    }

    static void guessTheWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        String word = words[rand.nextInt(25)];
        String userWord = readString().toLowerCase(Locale.ROOT);
        do {
            if (word.equals(userWord)){
                System.out.println("Вы выиграли!");
                break;

            } else {
                System.out.println("Вы не угадали, но вот подсказка! *Кол-во букв не cовпадает для конспирации*");
                for (int i = 0; i < 15; i++) {
                    if (i < word.length() && i < userWord.length()) {
                        if (word.charAt(i) == userWord.charAt(i)) {
                            System.out.print(word.charAt(i));
                        } else System.out.print("#");
                    } else System.out.print("#");
                }
                System.out.println();
                userWord = readString().toLowerCase(Locale.ROOT);
            }
        } while (true);
    }

    static String readString(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово in English: ");
        return scan.next();
    }
}
