package com.example.myspringboot.model;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private Float engine;
    private Modification modifications;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getEngine() {
        return engine;
    }

    public void setEngine(Float engine) {
        this.engine = engine;
    }

    public Modification getModifications() {
        return modifications;
    }

    public void setModifications(Modification modifications) {
        this.modifications = modifications;
    }

}
