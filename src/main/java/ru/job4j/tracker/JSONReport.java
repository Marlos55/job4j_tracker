package ru.job4j.tracker;

public class JSONReport extends TextReport{

    public String generate(String name, String body) {
        return "{" +
                "\n\tname: " + name +
                "\n\tbody: " + body +
                "\n}";
    }
}