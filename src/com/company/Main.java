package com.company; //checksForLeapYear

public class Main {
    public static void separation(){
        System.out.println("---------------------------");
    }

    public static void printWeighable (int checksForLeapYear){
        if (checksForLeapYear < 1584) {
            System.out.println("Високосный год был введён только в 1584 году, выберите другой год");
        } else if (checksForLeapYear% 400 == 0 || checksForLeapYear% 4 == 0) {
            System.out.println(checksForLeapYear + " год — високосный год");
        } else {
            System.out.println(checksForLeapYear + " год — невисокосный год");
        }

    }

    public static void applicationМersion (int a, int b){
        if (a >= 2015) {
            switch (b) {
                case 0:
                    System.out.println("Установите обычную версию приложения для iOS по ссылке");
                    break;
                default:
                    System.out.println("Установите обычную версию приложения для Android по ссылке");
            }} else {
            switch (b) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                default:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }}
    }

    public static void checksDeliveryDay(int a) {
        int deliveryDay = 0;
        if (a <= 20) {
            deliveryDay = deliveryDay  + 1;
            System.out.println("Количество дней для доставки: " + deliveryDay);
        } else if (a > 20 && a <= 60){
            deliveryDay = deliveryDay + 2;
            System.out.println("Количество дней для доставки: " + deliveryDay);
        } else if (a > 60 && a <= 100){
            deliveryDay = deliveryDay + 3;
            System.out.println("Количество дней для доставки: " + deliveryDay);
        } else {
            System.out.println("доставки нет");
        }
    }

    public static void main(String[] args) {
        System.out.println(" Задача 1");
        int year = 2021;
        printWeighable(year);
        separation();
        System.out.println(" Задача 2");
        int clientDeviceYear = 2015;
        int clientOS2 = 1;
        applicationМersion(clientDeviceYear, clientOS2);
        separation();
        System.out.println(" Задача 3");
        int deliveryDistance = 95;
        checksDeliveryDay(deliveryDistance);

}}
