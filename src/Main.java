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

    public static void main(String[] args) {
        task1_1();
    }
}