package com.codeinvestigator.demospringbootmongodb.space;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spaceship")
@RequiredArgsConstructor
public class SpaceShipRestController {
    private final SpaceShipService spaceShipService;

    @GetMapping("/")
    public List<SpaceShip> ships(@RequestParam String captainname) {
        return spaceShipService.findForCaptain(captainname);
    }
}
