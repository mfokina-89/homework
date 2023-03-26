package com.fokinamn.oop.thread.model;

import com.fokinamn.oop.thread.util.CrystalConstant;

import java.util.EnumMap;
import java.util.Map;

public class Race {
    private final String name;
    private final Map<Crystal, Integer> crystals = new EnumMap<>(Crystal.class);

    public Race(String name) {
        this.name = name;
        crystals.put(Crystal.RED, 0);
        crystals.put(Crystal.WHITE, 0);
    }

    public void addCrystals(int redCrystals, int whiteCrystals) {
        crystals.merge(Crystal.RED, redCrystals, Integer::sum);
        crystals.merge(Crystal.WHITE, whiteCrystals, Integer::sum);
    }

    public boolean isEnoughCrystals() {
        return crystals.get(Crystal.RED) >= CrystalConstant.MAX_RED_CRYSTAL_TO_GATHER
                && crystals.get(Crystal.WHITE) >= CrystalConstant.MAX_WHITE_CRYSTAL_TO_GATHER;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println(name + " have: " + crystals);
    }
}
