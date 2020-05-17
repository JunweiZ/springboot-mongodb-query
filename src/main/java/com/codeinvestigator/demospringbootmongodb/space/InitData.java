package com.codeinvestigator.demospringbootmongodb.space;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitData {

    private final SpaceShipRepository spaceShipRepository;

    @PostConstruct
    public void createTestData(){
        spaceShipRepository.deleteAll();
        spaceShipRepository.saveAll(
                List.of(
                        new SpaceShip(null, "Falcon", 3, new Captain("Mike", 5)),
                        new SpaceShip(null, "Flying Sourcer", 2, new Captain("Mike", 5) ),
                        new SpaceShip(null, "Fancy Flyer", 2, new Captain("Mike", 5)),
                        new SpaceShip(null, "Blackbird", 33, new Captain("Jens", 3)),
                        new SpaceShip(null, "Huge ship", 12, new Captain("Torben", 4)),
                        new SpaceShip(null, "Eagle", 20, new Captain("Jan", 5)),
                        new SpaceShip(null, "Eager plane", 22, new Captain("Susan", 2)),
                        new SpaceShip(null, "Tweetiebird", 40, new Captain("Helen", 5))
                ));
    }

}
