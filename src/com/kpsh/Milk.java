package com.kpsh;

public class Milk {
    private String name;
    private int fatContentInPercent;
    private boolean isIntoStorage;

    public Milk() {
    }

    public Milk(String newName, int newFatContentInPercent1) {
        name = newName;
        fatContentInPercent = newFatContentInPercent1;
    }

    public Milk(String newName, int newFatContentInPercent1, boolean newIsIntoStorage) {
        name = newName;
        fatContentInPercent = newFatContentInPercent1;
        isIntoStorage = newIsIntoStorage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getFatContentInPercent() {
        return fatContentInPercent;
    }

    public void setFatContentInPercent(int fatContent) {
        this.fatContentInPercent = fatContent;
    }


    public boolean getIsIntoStorage() {
        return isIntoStorage;
    }

    public void setIsIntoStorage(boolean isIntoStorage) {
        this.isIntoStorage = isIntoStorage;
    }


    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Жирность в процентах: " + fatContentInPercent);

        if(isIntoStorage)
            System.out.println("Есть на складе");
        else
            System.out.println("Нет на складе");
    }

    public String toString() {
        return "Название: " + this.name + "," + " Жирность в процентах: " + this.fatContentInPercent + "," + " Наличие на складе: " + this.isIntoStorage;
    }
}
