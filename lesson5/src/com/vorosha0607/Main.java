package com.vorosha0607;

public class Main {

    public static void main(String[] args) {
        Employee[] ItDepartment = new Employee[5];
        ItDepartment[0] = new Employee("Воронина Анастасия Александровна", "начальник ИТ-отдела", "voroninaa209@gmail.com", "+7(906)636-33-55", 350000, 31);
        ItDepartment[1] = new Employee();
        ItDepartment[2] = new Employee("Голополосов Федор Алексеевич", "senior Java-программист", "gol@mail.ru", "89062123476", 250000, 41);
        ItDepartment[3] = new Employee("Фолина Ольга Алексеевна", "Web-designer", "OoOlga@gmail.com", "+7(942)264-74-45", 80000, 42);
        ItDepartment[4] = new Employee("Аркатов Павел Владиславович", "Front-end разработчик", "arkatic98@mail.com", "89312451246", 60000, 20);

        for (int i = 0; i < ItDepartment.length; i++) {
            if (ItDepartment[i].age >= 40)
                ItDepartment[i].consoleOutput();
        }
    }
}
