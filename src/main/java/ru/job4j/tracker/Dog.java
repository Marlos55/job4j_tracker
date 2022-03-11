package ru.job4j.tracker;

public class Dog {

    private String food;
    private String name;

    public void show(){
        System.out.println(this.name);
        System.out.println(this.food);
    }
    public void eat(String meat){
        this.food = meat;
    }
    public void giveNick(String nick){
        this.name = nick;
    }

    public static void main(String[] args) {
        Dog polkan = new Dog();
        polkan.giveNick("polkan");
        polkan.eat("kotleta");
        polkan.show();
        Dog sharik = new Dog();
        sharik.giveNick("sharik");
        sharik.eat("fish");
        sharik.show();
        Dog zhychka = new Dog();
        zhychka.giveNick("zhychka");
        zhychka.eat("kotleta");
        zhychka.show();
    }
}
