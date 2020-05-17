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
    public void createRows(){
        spaceShipRepository.deleteAll();
        Captain captain = new Captain("captain unittest",3);
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 4, captain));
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 14, captain));
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 3, captain));
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 5, captain));
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 1, captain));
        spaceShipRepository.save(new SpaceShip(null, "sourcer", 20,captain));
        spaceShipRepository.save(new SpaceShip(null, "fork", 4,captain));
        spaceShipRepository.save(new SpaceShip(null, "freesbee", 1,captain));
        spaceShipRepository.save(new SpaceShip(null, "rocket", 30,captain));
        System.out.println("Heres our sources:");
        spaceShipService.allTheSourcers().forEach(System.out::println);
        System.out.println("*** DONE ***");
    }
}