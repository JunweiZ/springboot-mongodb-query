package com.codeinvestigator.demospringbootmongodb.space;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpaceShipRepositoryQueryTest {

    @Autowired
    SpaceShipRepository spaceShipRepository;

    @Test
    public void testGetSpaceShipsF(){
        List<SpaceShip> spaceShips = spaceShipRepository.gimmeShipsStartWithF();
        spaceShips.forEach(System.out::println);
    }

    @Test
    public void testGetSpaceShipsE(){
        List<SpaceShip> spaceShips = spaceShipRepository.gimmeShipsStartWithE();
        spaceShips.forEach(System.out::println);
    }


    @Test
    public void testDeleteSpaceships(){
        List<SpaceShip> spaceShips = spaceShipRepository.deleteShipsWithE();
        spaceShips.forEach(s -> System.out.println(String.format("Deleted ship: %s", s)));

        List<SpaceShip> all = spaceShipRepository.findAll();
        for (SpaceShip spaceShip : all) {
            System.out.println("Existing spaceship: " + spaceShip);
        }
    }


}
