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
    }

    public static void main(String[] args) {
        task1_1();
        task1_2();
    }
}