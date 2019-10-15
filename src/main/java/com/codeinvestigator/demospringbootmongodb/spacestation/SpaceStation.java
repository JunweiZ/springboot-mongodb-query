package com.codeinvestigator.demospringbootmongodb.spacestation;

import com.codeinvestigator.demospringbootmongodb.space.SpaceShip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceStation {
    @Id
    private String mikesid;
    private String name;
    private Integer crew;
    @DBRef
    private List<SpaceShip> ships;
}
