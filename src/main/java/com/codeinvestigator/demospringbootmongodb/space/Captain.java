package com.codeinvestigator.demospringbootmongodb.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Captain {
    private String name;
    private Integer level;
}
