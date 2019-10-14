package com.codeinvestigator.demospringbootmongodb.spacestation;

import com.codeinvestigator.demospringbootmongodb.space.SpaceShip;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpaceStationRepositoryTest {

    @Autowired
    SpaceStationRepository spaceStationRepository;

    @Test
    public void testStation(){
        for (SpaceStation spaceStation : spaceStationRepository.findAll()) {
            for (SpaceShip ship : spaceStation.getShips()) {
                System.out.println(String.format("Station: %s, Ship: %s", spaceStation.getName(), ship.getType()));
            }
        }
    }
}