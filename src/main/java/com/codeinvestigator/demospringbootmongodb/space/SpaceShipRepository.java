package com.codeinvestigator.demospringbootmongodb.space;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpaceShipRepository extends MongoRepository<SpaceShip, String> {

}
