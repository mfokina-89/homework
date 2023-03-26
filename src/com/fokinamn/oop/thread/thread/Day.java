package com.fokinamn.oop.thread.thread;

import com.fokinamn.oop.thread.model.Race;

public class Day extends Thread {
    private final Object lock = new Object();
    private final Race fairRace;
    private final Race airRace;

    public Day(Race fairRace, Race airRace) {
        this.fairRace = fairRace;
        this.airRace = airRace;
    }

    @Override
    public void run() {
        int dayCounter = 1;
        while (!(fairRace.isEnoughCrystals() || airRace.isEnoughCrystals())) {
            synchronized (lock) {
                try {
                    System.out.println("--------------------");
                    System.out.println("Day" + dayCounter + " started.");
                    lock.notifyAll();
                    lock.wait(100L);
                    dayCounter++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    public Object getLock() {
        return lock;
    }

    public Race getFairRace() {
        return fairRace;
    }

    public Race getAirRace() {
        return airRace;
    }
}
