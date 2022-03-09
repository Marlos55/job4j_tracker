package ru.job4j.tracker;

public class Jukebox {

    public static void main(String[] args) {
        Jukebox p = new Jukebox();
        int song = 2;
        p.music(song);

    }
    public void music(int posit){
        if(posit == 1){
            System.out.println("Пусть бегут неуклюже");
        }
        else if(posit == 2){
            System.out.println("Спокойной ночи");
        }
        System.out.println("Песня не найдена");

    }
}




