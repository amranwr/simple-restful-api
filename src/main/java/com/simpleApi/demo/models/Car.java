package com.simpleApi.demo.models;

public class Car {
    private int id;
    private String name;
    private String type;

    public Car(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }
}
