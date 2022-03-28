package ru.job4j.tracker;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 500);
        Book Gulliver = new Book("Gulliver", 128);
        Book lordOfTheFlies = new Book("lord of the flies", 320);
        Book Aladdin = new Book("Clean code", 144);
        Book[] book = new Book[4];
        book[0] = cleanCode;
        book[1] = Gulliver;
        book[2] = lordOfTheFlies;
        book[3] = Aladdin;
        for (int i = 0; i < book.length; i++) {
            Book bo = book[i];
            System.out.println(bo.getName() + " - " + bo.getNumbersPages());

        }
        Book tem = book[0];
        book[0] = book[3];
        book[3] = tem;
        for (int i = 0; i < book.length; i++) {
            Book bo = book[i];
            System.out.println(bo.getName() + " - " + bo.getNumbersPages());

        }
        for (int i = 0; i < book.length; i++) {
            Book bo = book[i];
            if(bo.getName().equals("Clean code")){
                System.out.println(bo.getName() + " - " + bo.getNumbersPages());
            }

        }
    }
}
