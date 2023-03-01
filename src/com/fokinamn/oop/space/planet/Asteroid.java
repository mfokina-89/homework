package com.fokinamn.oop.space.planet;


public class Asteroid extends SpaceObject{
    private int speed;

    public Asteroid(String name, String color, double weight, double radius, int speed) {
        super(name, color, weight, radius);
        this.speed = speed;
    }

    @Override
    public double diameter() {
        return getRadius() * 2.1;
    }

    @Override
    public String toString() {
        return "Asteroid " + getName() +
                ", color " + getColor() +
                ", weight " + getWeight() +
                ", radius " + getRadius() +
                ", flies at speed " + speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
