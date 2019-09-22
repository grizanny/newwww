package com.kpsh;

public class Main {
    public static void main(String[] args) throws Exception {

        Milk milk1 = new Milk("Савушкин продукт", 10, true);
        Milk milk2 = new Milk("Простоквашино", 18, false);
        Milk milk3 = new Milk("Шишкино", 11);


        String s = milk1.getName();
        System.out.println("Название первого молока: " + s);

        milk1.setIsIntoStorage(true);
        System.out.println();
        System.out.println("--- Первый продукт ---");
        milk1.printInfo();

        milk2.setIsIntoStorage(false);
        System.out.println();
        System.out.println("--- Второй продукт ---");
        milk2.printInfo();

        System.out.println(milk3.toString());

        WriterInfo.printAllInfo(milk1);
    }
}
