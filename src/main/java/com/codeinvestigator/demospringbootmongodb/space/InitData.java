package com.codeinvestigator.demospringbootmongodb.space;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class InitData {

    private final SpaceShipRepository spaceShipRepository;

    public InitData(SpaceShipRepository spaceShipRepository) {
        this.spaceShipRepository = spaceShipRepository;
    }

    @PostConstruct
    public void createTestData(){
        spaceShipRepository.saveAll(
                List.of(
                        new SpaceShip(null, "Falcon", 3),
                        new SpaceShip(null, "Flying Sourcer", 2),
                        new SpaceShip(null, "Fancy Flyer", 2),
                        new SpaceShip(null, "Blackbird", 33),
                        new SpaceShip(null, "Huge ship", 12),
                        new SpaceShip(null, "Eagle", 20),
                        new SpaceShip(null, "Eager plane", 22),
                        new SpaceShip(null, "Tweetiebird", 40)
                ));
    }

}
