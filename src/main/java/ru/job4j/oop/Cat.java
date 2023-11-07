package ru.job4j.oop;

public class Cat {
    private String food;

    private static int number;

    public String sound() {
        return "may-may";
    }
    public void show() {
        System.out.println(this.food);
    }

    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.show();
        System.out.println("There is black's food.");
        Cat black = new Cat();
        black.show();
        System.out.println(number);
    }
}
