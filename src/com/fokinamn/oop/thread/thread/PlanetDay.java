package com.fokinamn.oop.thread.thread;

import com.fokinamn.oop.thread.model.Planet;
import com.fokinamn.oop.thread.util.CrystalConstant;
import com.fokinamn.oop.thread.util.RandomUtil;

public class PlanetDay extends Thread {
    private final Planet planet;
    private final Day day;

    public PlanetDay(Day day) {
        this.day = day;
        this.planet = new Planet();
    }

    @Override
    public void run() {
        try {
            while (!(day.getAirRace().isEnoughCrystals() || day.getFairRace().isEnoughCrystals())) {
                growCrystals();
                waitNextDay();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void growCrystals() {
        int allCrystalsGenerated = RandomUtil.getRandomBetween(CrystalConstant.MIN_DAY_CRYSTAL_TO_GROW,
                CrystalConstant.MAX_DAY_CRYSTAL_TO_GROW);
        int whiteCrystalsToAdd = RandomUtil.getRandomFrom(allCrystalsGenerated);
        int redCrystalsToAdd = allCrystalsGenerated - whiteCrystalsToAdd;
        synchronized (planet.getLock()) {
            planet.addCrystals(redCrystalsToAdd, whiteCrystalsToAdd);
            System.out.println("Planet grow up: " + redCrystalsToAdd + " red crystals and "
                    + whiteCrystalsToAdd + " white crystals.");
            System.out.println("Now planet has: " + planet.getCrystals());
        }
    }

    private void waitNextDay() throws InterruptedException {
        synchronized (day.getLock()) {
            day.getLock().wait();
        }
    }

    public Planet getPlanet() {
        return planet;
    }
}
