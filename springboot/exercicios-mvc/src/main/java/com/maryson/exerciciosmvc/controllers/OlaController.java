package com.maryson.exerciciosmvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping(path = "/ola")
    public String ola() {
        return "Olá!!";
    }
}
