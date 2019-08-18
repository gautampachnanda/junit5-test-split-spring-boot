package org.pachnanda.simple.controllers;

import io.swagger.annotations.ApiOperation;
import org.pachnanda.simple.model.Welcome;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @ApiOperation(value = "Welcome message", response = String.class)
    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @ApiOperation(value = "Welcome object", response = Welcome.class)
    @RequestMapping("/welcome")
    public ResponseEntity<Welcome> welcomeObject() {
        return ResponseEntity.ok(new Welcome("Hi!"));
    }
}
