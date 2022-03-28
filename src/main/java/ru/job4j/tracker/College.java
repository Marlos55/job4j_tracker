package ru.job4j.tracker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class College {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();
        student.setName("Ver");
        student.setSurname("Al");
        student.setPatronymic("vagh");
        student.setGroup("group");
        student.setReceiptDate(new SimpleDateFormat("dd.MM.yyyy").parse("01.09.2017"));
        System.out.println("Имя : " + student.getName() + "\nФамилия: " + student.getSurname() + "\nОтчество: " + student.getPatronymic() + "\nГруппа: " + student.getGroup() + "\nДата поступления: " + student.getReceiptDate());
    }
}
