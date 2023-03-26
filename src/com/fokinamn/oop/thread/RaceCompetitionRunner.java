package com.fokinamn.oop.thread;

import com.fokinamn.oop.thread.model.Race;
import com.fokinamn.oop.thread.thread.Day;
import com.fokinamn.oop.thread.thread.PlanetDay;
import com.fokinamn.oop.thread.thread.RaceRocket;
import com.fokinamn.oop.thread.util.ThreadUtil;

public class RaceCompetitionRunner {
    public static void main(String[] args) throws InterruptedException {
        Race airRace = new Race("Air Mages");
        Race fairRace = new Race("Fair Mages");
        Day day = new Day(airRace, fairRace);
        PlanetDay planetDay = new PlanetDay(day);
        RaceRocket airRaceRocket = new RaceRocket(day, airRace, planetDay.getPlanet());
        RaceRocket fairRaceRocket = new RaceRocket(day, fairRace, planetDay.getPlanet());

        ThreadUtil.startThreads(day, planetDay, airRaceRocket, fairRaceRocket);
        ThreadUtil.joinThreads(day, planetDay, airRaceRocket, fairRaceRocket);

        System.out.println("Competition is over.");
        airRace.printInfo();
        fairRace.printInfo();
    }
}
