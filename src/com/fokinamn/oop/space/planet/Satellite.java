package com.fokinamn.oop.space.planet;

import com.fokinamn.oop.space.characteristic.Rotation;

public class Satellite extends SpaceObject implements Rotation {
    private boolean artificial;

    public Satellite(String name, String color, double weight, double radius, boolean artificial) {
        super(name, color, weight, radius);
        this.artificial = artificial;
    }

    @Override
    public void rotate () {
        System.out.println("Satellite " + getName() + " rotate around planet ");
    }

    @Override
    public double diameter() {
        return getRadius() * 2 - 10;
    }

    @Override
    public String toString() {
        return "Satellite " + getName() +
                ", color " + getColor() +
                ", weight " + getWeight() +
                ", radius " + getRadius() +
                ", artificial " + artificial;
    }

    public boolean isArtificial() {
        return artificial;
    }

    public void setArtificial(boolean artificial) {
        this.artificial = artificial;
    }
}
