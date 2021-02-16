public class Main {

    public static void main(String[] args){

        // целые числа
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 4000;

        //добные числа
        float f = 15.222221f;
        double d = 17.32432;

        char c = 'n';

        boolean bol = true;

        //проверка работы методов
        float resCount = count(3.4f,2.5f,16.32f,1.23f);
        System.out.println("Ответ вычисления: " + resCount);

        boolean resCheck = check(6,18);
        System.out.println("Ответ проверки 10<=x<=20: " + resCheck);

        posOrNeg(9);

        boolean resBolPosOrNeg = bolPosOrNeg(-15);
        if (resBolPosOrNeg == false){
            System.out.println("Выбранное число положительное или равно 0");
        } else System.out.println("Выбранное число отрицательное");

        String name = "Настя";
        helloName(name);

        leapYear(2019);
    }

    static float count(float a, float b, float c, float d){
        return (a*(b+(c/d)));
    }

    static boolean check(int a, int b){
        if ((a+b)>=10 && (a+b)<=20) {
            return true;
        } else return false;
    }

    static void posOrNeg(int a){
        if (a >= 0){
            System.out.println("Число положительное или равно 0");
        } else System.out.println("Число отрицательное");
    }

    static boolean bolPosOrNeg(int a){
        if (a >= 0){
            return false;
        } else return true;
    }

    static void helloName(String name){
        System.out.println("Привет, " + name + "!");
    }

    static void leapYear(int year){
        if ((year%4) == 0 && ((year%100) != 0 || (year%400) == 0)){
            System.out.println("Это високостный год!");
        } else System.out.println("Это не високосный год!");
    }

}

