package com.fokinamn.oop.space.planet;

import com.fokinamn.oop.space.characteristic.Shining;

public class Star extends SpaceObject implements Shining {
    private double temperature;

    public Star(String name, String color, double weight, double radius, double temperature) {
        super(name, color, weight, radius);
        this.temperature = temperature;
    }

    @Override
    public void shine() {
        System.out.println("Star " + getName() + " shining next to the moon");
    }

    @Override
    public double diameter() {
        return getRadius() * 1.5;
    }

    @Override
    public String toString() {
        return "Star " + getName() +
                ", color " + getColor() +
                ", weight " + getWeight() +
                ", radius " + getRadius() +
                ", temperature " + temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
