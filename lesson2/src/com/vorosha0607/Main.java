package com.vorosha0607;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1. Заменить 1 на 0 и наоборот");
        int[] zeroAndOne = {1, 0, 0, 1, 0, 0, 1, 1, 1, 1};
        for (int i = 0; i < zeroAndOne.length; i++){
            zeroAndOne[i] = (zeroAndOne[i] == 1) ? 0 : 1;
//            второй способ:
//            zeroAndOne[i] = 1 - zeroAndOne[i];
            System.out.print(zeroAndOne[i] + " ");
        }
        System.out.println();

        System.out.println("Задание 2. Инициализоровать и заполнить массив числами 0, 3, 6, 9, ...");
        int[] plusThree = new int[8];
        int c = 0;
        for (int i = 0; i < plusThree.length; i++){
            plusThree[i] = c;
            c += 3;
            System.out.print(plusThree[i] + " ");
        }
        System.out.println();

        System.out.println("Задание 3. Числа массива меньшие 6 умножить на 2");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Задание 4. Запонить диагональные элементы квадратного массива 1");
        int[][] diagonalOne = new int[5][5];
        for (int i = 0; i < diagonalOne.length; i++) {
            for (int j = 0; j < diagonalOne.length; j++) {
                if ( i == j || i == (diagonalOne.length - 1 - j)){
                    diagonalOne[i][j] = 1;
                }
                System.out.print(diagonalOne[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Задание 5**. Найти min и max");
        int[] findMinAndMax = { 4, 2, 12, 6, 8, 0, -10, 52, -100, 0 };
        int min = findMinAndMax[0];
        int max = findMinAndMax[0];
        for (int i = 1; i < findMinAndMax.length; i++) {
            if (findMinAndMax[i] < min)
                min = findMinAndMax[i];
            if (findMinAndMax[i] > max)
                max = findMinAndMax[i];
        }
        System.out.println("Минимальное значение массива = " + min);
        System.out.println("Максимальное значение массива = " + max);

        System.out.println("Задание 6**. Найти граница, где сумма равна");
        int[] findBorder = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean resultCheckBorder = checkBorder(findBorder);
        System.out.println(resultCheckBorder);

        System.out.println("Задание 7****. Сместить массив");
        int[] arrToMove = {2,5,7,1,7};
        int n = -2;
        moveArray(arrToMove, n);

    }

    public static boolean checkBorder (int array[]){
        int leftSide = array[0];
        int rightSide = 0;
        for (int i = 1; i < array.length; i++) { //считаем всю правую часть (сумма всех эл-ов массива кроме первого)
            rightSide += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (leftSide == rightSide) {
                return true;
            } else {
                leftSide += array[i];
                rightSide -= array[i];
            }
        }
        return false;
    }

    public static void moveArray(int arr[], int n){
        if (n > 0){
            for (int i = 0; i < n; i++) {
                moveRight(arr);
            }
        } else if (n < 0){
            for (int i = n; i < 0; i++) {
                moveLeft(arr);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void moveRight(int array[]){   //а нужно писать в скобках int[] название
        // или int название[] для массивов или неважно?
        int buffer = array[0];
        array[0] = array[array.length-1];
        for (int i = 1; i < array.length - 1; i++) {
            array[array.length-i] = array[array.length-i-1];
        }
        array[1] = buffer;
    }

    public static void moveLeft(int array[]){
        int buffer = array[array.length-1];
        array[array.length-1] = array[0];
        for (int i = 1; i < array.length-1; i++) {
            array[i-1] = array[i];
        }
        array[array.length-2] = buffer;
    }
}
