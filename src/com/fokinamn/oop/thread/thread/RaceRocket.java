package com.fokinamn.oop.thread.thread;

import com.fokinamn.oop.thread.model.Crystal;
import com.fokinamn.oop.thread.model.Planet;
import com.fokinamn.oop.thread.model.Race;
import com.fokinamn.oop.thread.util.CrystalConstant;
import com.fokinamn.oop.thread.util.RandomUtil;

import java.util.Map;

public class RaceRocket extends Thread {

    private final Day day;
    private final Race race;
    private final Planet planet;

    public RaceRocket(Day day, Race race, Planet planet) {
        this.day = day;
        this.race = race;
        this.planet = planet;
    }

    @Override
    public void run() {
        try {
            while (!(day.getFairRace().isEnoughCrystals() || day.getAirRace().isEnoughCrystals())) {
                Map<Crystal, Integer> crystals = gatherCrystalsFromPlanet();
                race.addCrystals(crystals.get(Crystal.RED), crystals.get(Crystal.WHITE));
                waitNextDay();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Map<Crystal, Integer> gatherCrystalsFromPlanet() {
        int allCrystalsGenerated = RandomUtil.getRandomBetween(CrystalConstant.MIN_DAY_CRYSTAL_TO_GET,
                CrystalConstant.MAX_DAY_CRYSTAL_TO_GET);
        int whiteCrystalsToGet = RandomUtil.getRandomFrom(allCrystalsGenerated);
        int redCrystalsToGet = allCrystalsGenerated - whiteCrystalsToGet;
        Map<Crystal, Integer> gatheredCrystalsFromPlanet;
        synchronized (planet.getLock()) {
            gatheredCrystalsFromPlanet = planet.getCrystals(redCrystalsToGet, whiteCrystalsToGet);
            System.out.println(race.getName() + " rocket gathers " + gatheredCrystalsFromPlanet.get(Crystal.RED)
                    + " red crystals and " + gatheredCrystalsFromPlanet.get(Crystal.WHITE) + " white crystals.");
            System.out.println("Now planet has: " + planet.getCrystals());
        }
        return gatheredCrystalsFromPlanet;
    }

    private void waitNextDay() throws InterruptedException {
        synchronized (day.getLock()) {
            day.getLock().wait();
        }
    }
}
