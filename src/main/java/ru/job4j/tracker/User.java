package ru.job4j.tracker;

public class User {
    private String name; // поле объекта т.к находиться после класса и не в медоде.
    private int age; // поле объекта т.к находиться после класса и не в медоде.

    public boolean canDrive() {
        boolean can = false; // переменная является локальной т.к находиться в методе.
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}