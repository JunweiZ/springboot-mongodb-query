package com.codeinvestigator.demospringbootmongodb.spacestation;

import com.codeinvestigator.demospringbootmongodb.space.SpaceShip;
import com.codeinvestigator.demospringbootmongodb.space.SpaceShipRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SpaceStationInitTestData {

    private final SpaceShipRepository spaceShipRepository;
    private final SpaceStationRepository spaceStationRepository;

    public SpaceStationInitTestData(SpaceShipRepository spaceShipRepository, SpaceStationRepository spaceStationRepository) {
        this.spaceShipRepository = spaceShipRepository;
        this.spaceStationRepository = spaceStationRepository;
    }

    //        List<SpaceShip> newShips = List.of(
//                new SpaceShip(null, "Fast ship", 10),
//                new SpaceShip(null, "Slow ship", 2)
//        );
//
//        List<SpaceShip> otherShips = List.of(
//                new SpaceShip(null, "Medium ship", 110),
//                new SpaceShip(null, "Shiny ship", 12)
//        );
    @PostConstruct
    public void createStations(){
        List<SpaceShip> spaceShipsWithE = spaceShipRepository.gimmeShipsStartWithE();
        List<SpaceShip> spaceShipsWithF = spaceShipRepository.gimmeShipsStartWithF();
        spaceStationRepository.deleteAll();
        spaceStationRepository.saveAll(
                List.of(
                        new SpaceStation(null, "Peace Station", 20000, spaceShipsWithE),
                        new SpaceStation(null, "Mining Station", 4000, spaceShipsWithF)
                )
        );
    }
}
