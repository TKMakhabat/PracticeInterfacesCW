package com.makhabatusen.light;

public class Lamp implements Light {
    private String color;

    public Lamp(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getWattConsume(int watt) {
        return watt;
    }
}
