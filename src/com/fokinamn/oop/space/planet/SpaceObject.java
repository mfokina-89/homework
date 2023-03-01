package com.fokinamn.oop.space.planet;

public abstract class SpaceObject {
    private final String name;
    private final String color;
    private final double weight;
    private final double radius;

    public SpaceObject(String name, String color, double weight, double radius) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.radius = radius;
    }

    public abstract double diameter();

    public void compareWeight(SpaceObject spaceObject2) {
        if (this.getWeight() > spaceObject2.getWeight()) {
            System.out.println("The weight of " + this.getName() +
                    " is greater than the weight of " + spaceObject2.getName());
        } else if (this.getWeight() == spaceObject2.getWeight()) {
            System.out.println("The objects are equal!");
        } else if (this.getWeight() < spaceObject2.getWeight()) {
            System.out.println("The weight of " + this.getName() +
                    " is less than the weight of " + spaceObject2.getName());
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getRadius() {
        return radius;
    }
}
