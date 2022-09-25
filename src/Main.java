public class Main {
    //Домашнее задание -1. Задача 1
    public static void task1_1(){
        int month = 0;
        int addSummMoney = 15000;
        float accumMoney = 0;
        System.out.println("Задание 1: ");
        while (accumMoney < 2_459_000) {
            month++;
            accumMoney = accumMoney * 1.12f + addSummMoney;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + accumMoney + " рублей");
        }
    }

    //Домашнее задание -1. Задача 2
    public static void task1_2(){
        System.out.println("Задание 2: ");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.print("\n");

        for (; num >= 1; num--) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }

    //Домашнее задание -1. Задача 3
    public static void task1_3(){
        System.out.println("Задание 3: ");
        int currentYear = 2022;
        int population = 12_000_000;
        double fertility = (double) 17 / 1000;
        double mortality = (double) 8 / 1000;

        for (int year = currentYear + 1 ; year <= currentYear + 10; year++) {
            population += Math.round(fertility * population) - Math.round(mortality * population);
            System.out.println("Год " +  year + ", численность населения составляет " + population);
        }
    }

    //Домашнее задание -2. Задача 1
    public static void task2_1(){
        System.out.println("Задание 4: ");
        int currentSumm = 15_000;
        int maxSumm = 12_000_000;
        int month = 1;
        for (; currentSumm < maxSumm ; month++) {
            currentSumm+= currentSumm * 0.07;
            System.out.println("month= " + month + " currentSumm= " + currentSumm);
        }
    }

    //Домашнее задание -2. Задача 2
    public static void task2_2(){
        System.out.println("Задание 5: ");
        int currentSumm = 15_000;
        int maxSumm = 12_000_000;
        int month = 1;
        for (; currentSumm < maxSumm ; month++) {
            currentSumm+= currentSumm * 0.07;
            if (month % 6 == 0) {
                System.out.println("month= " + month + " currentSumm= " + currentSumm);
            }
        }
    }

    //Домашнее задание -2. Задача 3
    public static void task2_3(){
        System.out.println("Задание 6: ");
        int currentSumm = 15_000;
        int cntYear = 9;
        for (int month = 1; month <= cntYear * 12 ; month++) {
            currentSumm+= currentSumm * 0.07;
            if (month % 6 == 0) {
                System.out.println("month= " + month + " currentSumm= " + currentSumm);
            }
        }
    }

    //Домашнее задание -2. Задача 4
    public static void task2_4(){
        System.out.println("Задание 7: ");
        int friday = 2;

        for (int curDay = 1; curDay <= 31 ; curDay++) {
            if ((curDay - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + curDay + "-е число. Необходимо подготовить отчет.");
            }
        }
    }

    //Домашнее задание -3. Задача 1
    public static void task3_1(){
        System.out.println("Задание 8: ");
        int currentDate = 2022;
        int startDate = currentDate - 200;
        int endDate = currentDate + 100;

        for (int i = startDate; i <= endDate ; i++){
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }

    //Домашнее задание -3. Задача 1
    public static void task3_2(){
        System.out.println("Задание 9: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*"+ i + " = " + i * 2);
        }
    }
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task3_1();
        task3_2();
    }
}