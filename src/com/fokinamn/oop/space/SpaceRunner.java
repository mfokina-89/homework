package com.fokinamn.oop.space;

import com.fokinamn.oop.space.enumeration.Color;
import com.fokinamn.oop.space.planet.Asteroid;
import com.fokinamn.oop.space.planet.Planet;
import com.fokinamn.oop.space.planet.Satellite;
import com.fokinamn.oop.space.planet.Star;


public class SpaceRunner {
    public static void main(String[] args) {
        Asteroid asteroid = new Asteroid("Pol", Color.BROWN.getColor(), 45.6, 67.9,56);
        Planet planet = new Planet("Earth", Color.GREEN.getColor(), 56.9,567.5,true);
        Satellite satellite = new Satellite("Moon", Color.BLACK.getColor(), 23.6, 13.9, false);
        Star star = new Star("Andromeda", Color.YELLOW.getColor(), 34.6,14.8,567.8);

        System.out.println(asteroid);
        System.out.println(planet);
        System.out.println(satellite);
        System.out.println(star);

        satellite.rotate();
        star.shine();

        System.out.println("Is a satellite " + satellite.getName() + " a star? " + SpaceUtils.isStar(satellite));
        System.out.println("The force of gravity between planet " + planet.getName() + " and star "
                + star.getName() + " is " + SpaceUtils.gravityBetweenObjects(planet, star));

        asteroid.compareWeight(planet);

        System.out.println("Diameter of planet " + planet.getName() + " is " + planet.diameter());
    }
}
