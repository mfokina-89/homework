package com.fokinamn.oop.thread.model;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Planet {
    private final Object lock = new Object();
    private final Map<Crystal, Integer> crystals = new EnumMap<>(Crystal.class);

    public Planet() {
        crystals.put(Crystal.RED, 0);
        crystals.put(Crystal.WHITE, 0);
    }

    public void addCrystals(int redCrystals, int whiteCrystals) {
        crystals.merge(Crystal.RED, redCrystals, Integer::sum);
        crystals.merge(Crystal.WHITE, whiteCrystals, Integer::sum);
    }

    public Map<Crystal, Integer> getCrystals(int redCrystalsToGet, int whiteCrystalsToGet) {
        Map<Crystal, Integer> crystalsToGet = new HashMap<>();
        if (redCrystalsToGet > crystals.get(Crystal.RED)) {
            crystalsToGet.put(Crystal.RED, crystals.get(Crystal.RED));
            crystals.put(Crystal.RED, 0);
        } else {
            crystalsToGet.put(Crystal.RED, redCrystalsToGet);
            crystals.put(Crystal.RED, crystals.get(Crystal.RED) - redCrystalsToGet);
        }

        if (whiteCrystalsToGet > crystals.get(Crystal.WHITE)) {
            crystalsToGet.put(Crystal.WHITE, crystals.get(Crystal.WHITE));
            crystals.put(Crystal.WHITE, 0);
        } else {
            crystalsToGet.put(Crystal.WHITE, whiteCrystalsToGet);
            crystals.put(Crystal.WHITE, crystals.get(Crystal.WHITE) - whiteCrystalsToGet);
        }
        return crystalsToGet;
    }

    public Object getLock() {
        return lock;
    }

    public Map<Crystal, Integer> getCrystals() {
        return crystals;
    }
}
