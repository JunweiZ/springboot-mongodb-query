package com.codeinvestigator.demospringbootmongodb.spacestation;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpaceStationRepository extends MongoRepository<SpaceStation, String> {


}
