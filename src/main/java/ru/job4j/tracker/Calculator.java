package ru.job4j.tracker;

public class Calculator {
    private static int x = 5;

    public static int minus(int z){
        return z - x;
    }

    public int divide(int c){
        return x / c;
    }
    public static int sum(int y) {
        return x + y;
    }
    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int b){
        return sum(b) + divide(b) + minus(b) + multiply(b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.sumAllOperation(10);
        System.out.println(rsl);
    }
}