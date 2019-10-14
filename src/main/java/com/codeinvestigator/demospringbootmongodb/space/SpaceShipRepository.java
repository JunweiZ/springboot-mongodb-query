package com.codeinvestigator.demospringbootmongodb.space;

import ch.qos.logback.core.read.ListAppender;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SpaceShipRepository extends MongoRepository<SpaceShip, String> {



    @Query("{ 'type': {$regex: '^F.*'}}")
    public List<SpaceShip> shipsWithF();
}
