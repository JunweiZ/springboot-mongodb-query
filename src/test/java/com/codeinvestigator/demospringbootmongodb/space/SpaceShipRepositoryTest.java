package com.codeinvestigator.demospringbootmongodb.space;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpaceShipRepositoryTest {

    @Autowired
    SpaceShipRepository spaceShipRepository;

    @Autowired
    SpaceShipService spaceShipService;

    @Test
    public void shipsWithF(){
        List<SpaceShip> spaceShips = spaceShipRepository.shipsWithF();
        spaceShips.forEach(System.out::println);
    }

    @Test
    public void createRows(){
        spaceShipRepository.deleteAll();
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 4));
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 14));
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 3));
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 5));
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 1));
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 20));
        spaceShipRepository.save(new SpaceShip(null, "fork", 4));
        spaceShipRepository.save(new SpaceShip(null, "freesbee", 1));
        spaceShipRepository.save(new SpaceShip(null, "rocket", 30));

//        spaceShipRepository.findAll().forEach(System.out::println);
        System.out.println("Heres our sources:");
        spaceShipService.allTheSourcers().forEach(System.out::println);
        System.out.println("*** DONE ***");


    }
}