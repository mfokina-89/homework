package com.fokinamn.oop.space.enumeration;

public enum Color {
    YELLOW ("yellow"),
    BLACK ("black"),
    GREEN ("green"),
    RED ("red"),
    BROWN ("brown");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
