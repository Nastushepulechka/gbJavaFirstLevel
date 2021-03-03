package com.vorosha0607;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static int DOTS_TO_WIN;

    public static void main(String[] args) {
        ticTacToe();

    }

    static void ticTacToe(){

        int N;
        System.out.print("Введите размер игрового поля: ");
        N = readIntFromConsole();
        char[][] map = new char[N][N];
        initPlayingField(map);
        outputPlayingField(map);
        // do while будет тут
        do {
            System.out.println("Ваш ход:");
            humanTurn(map);
            outputPlayingField(map);
            if ( checkWin(map, DOT_X) ){
                break;
            }
            if (fullMap(map)) break;
            System.out.println("Ход компьютера:");
            computerTurn(map, N);
            outputPlayingField(map);
            if ( checkWin(map, DOT_O) ){
                break;
            }
        } while (!fullMap(map));

    }

    static void initPlayingField(char[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void outputPlayingField(char arr[][]){
        for (int i = 0; i <= arr.length; i++) {
            if (i==0)
                System.out.print("  ");
            else
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int readIntFromConsole(){
        Scanner scan = new Scanner(System.in);
        do {

            if (scan.hasNextInt()){
                return scan.nextByte();
            }
            System.out.print("Ввод некорректен, попробуйте еще раз: ");
            scan.nextLine();
        } while (true);

    }

    static void humanTurn(char map[][]){
        int X, Y;
        do {
            System.out.print("Введите координату точки по X(горизонтали): ");
            X = readIntFromConsole() - 1;
            System.out.print("Введите координату точки по Y(вертикали): ");
            Y = readIntFromConsole() - 1;

        } while (!isCellValid(X, Y, map));
        map[Y][X] = DOT_X;
    }

    public static boolean isCellValid(int x, int y, char map[][]) {
        if (x < 0 || x >= map.length || y < 0 || y >= map.length) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    static void computerTurn(char map[][], int N){
        Random rand = new Random();
        do {
            int X = rand.nextInt(N);
            int Y = rand.nextInt(N);
            if (map[Y][X] == DOT_EMPTY) {
                map[Y][X] = DOT_O;
                break;
            }
        } while (true);
    }

    static boolean fullMap(char map[][]){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;

            }
        }
        System.out.println("Свободные клетки закончились, ничья!");
        return true;
    }

    static boolean checkLines(char map[][], char DOT){
        int countG = 0;
        int countV = 0;
        if (map.length < 4) {
            DOTS_TO_WIN = map.length;
        } else {
            DOTS_TO_WIN = 4;
        }
        //проверяем строки
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT){
                    countG++;
                } else countG = 0;
                if (map[j][i] == DOT){
                    countV++;
                } else  countV = 0;
            }
            if (countG == DOTS_TO_WIN || countV == DOTS_TO_WIN){
                System.out.println("Выиграл игрок, играющий "+ DOT);
                return true;
            }
            countG = 0;
            countV = 0;
        }

        return false;
    }

    static boolean checkDiagonals(char map[][], char DOT, int rowOffset, int columnOffset){
        int vertical1 = 0;
        int vertical2 = 0;
        int subSquareLength = DOTS_TO_WIN + rowOffset;
        //проверка по двум вертикалям
        for (int i = rowOffset; i < subSquareLength; i++) {
            for (int j = columnOffset; j < columnOffset+DOTS_TO_WIN; j++) {
                if (map[i][j]==DOT){         //главная диаг
                    vertical1++;
                }
                else vertical1 = 0;
                if (map[i][map.length - 1 - j]==DOT){       //побочная диаг
                    vertical2++;
                } else vertical2 = 0;

            }
            if (vertical1 == DOTS_TO_WIN || vertical2 == DOTS_TO_WIN) {
                System.out.println("Выиграл игрок, играющий "+ DOT);
                return true;
            }
        }
        return false;
    }

    static boolean checkWin(char map[][], char DOT){
        if (map.length < 4) {
            DOTS_TO_WIN = map.length;
        } else {
            DOTS_TO_WIN = 4;
        }
        int endOfOffset = map.length - DOTS_TO_WIN;
        if (checkLines(map, DOT))                     //проверка строчек же и так работает,
                                                    // не поняла зачем ее загонять в двойной массив тут?
            return true;
        for (int rowOffset = 0; rowOffset <= endOfOffset; rowOffset++) {
            for (int columnOffset = 0; columnOffset < endOfOffset; columnOffset++) {
                if (checkDiagonals(map, DOT, rowOffset, columnOffset))
                    return true;
            }
        }
        return false;
    }
    // не работает например вот так:
    // 0 1 2 3 4 5
    // 1 * * * * *
    // 2 X * * * *
    // 3 * X * * *
    // 4 * * X * *
    // 5 * * * X *
    // и такой, и так далее. У меня без метода квадратов также не работали только вот такие "мини" диагонали,
    // не понимаю почему метод квадратов не помог, мб что-то не так реализовала, нид хелп :(
    //  1 2 3 4 5
    //1 * X * * *
    //2 * * X * *
    //3 * * * X *
    //4 * * * * X
    //5 * * * * *
}
