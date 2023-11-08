package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    private Item() {

    }

    private Item(String name) {
        this.name = name;
    }

    private Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Item itemOne = new Item();
        Item itemTwo = new Item("name");
        Item itemThree = new Item(10, "name");
    }
}