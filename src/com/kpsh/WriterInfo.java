package com.kpsh;

public class WriterInfo {
    public static void printAllInfo(Milk milk) {
        printInfo(milk);
        if(milk.getIsIntoStorage())
            System.out.println("Есть на складе");
        else
            System.out.println("Нет на складе");
    }

    public static void printInfo(Milk milk) {
        System.out.println("Название: " + milk.getName());
        System.out.println("Жирность в процентах: " + milk.getFatContentInPercent());

    }
}
