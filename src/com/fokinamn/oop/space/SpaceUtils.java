package com.fokinamn.oop.space;

import com.fokinamn.oop.space.planet.SpaceObject;
import com.fokinamn.oop.space.planet.Star;

public final class SpaceUtils {

    static final double GRAVITY_CONSTANT = 6879;

    public SpaceUtils() {
    }

    public static double gravityBetweenObjects(SpaceObject spaceObject1, SpaceObject spaceObject2){
        return spaceObject1.getWeight() * spaceObject2.getWeight() * GRAVITY_CONSTANT / 15;
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }
}
