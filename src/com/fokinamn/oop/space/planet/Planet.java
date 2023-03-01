package com.fokinamn.oop.space.planet;

public class Planet extends SpaceObject{
    private boolean isInhabited;

    public Planet(String name, String color, double weight, double radius, boolean isInhabited) {
        super(name, color, weight, radius);
        this.isInhabited = isInhabited;
    }

    @Override
    public double diameter() {
        return getRadius() * 2;
    }

    @Override
    public String toString() {
        return "Planet " + getName() +
                ", isInhabited " + isInhabited +
                ", color " + getColor() +
                ", weight " + getWeight() +
                ", radius " + getRadius();
    }

    public boolean isInhabited() {
        return isInhabited;
    }

    public void setInhabited(boolean inhabited) {
        isInhabited = inhabited;
    }
}
