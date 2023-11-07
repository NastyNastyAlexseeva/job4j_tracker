package ru.job4j.oop;

public class Cat {
    private String food;

    private String name;

    private static int number;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        return "may-may";
    }
    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.name + ' ' + this.food);
    }

    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.show();
        System.out.println("There is black's food.");
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("kotleta");
        black.show();

        System.out.println(number);
    }
}
