package com.maryson.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
public class PrimeroController {

//    @RequestMapping(method = RequestMethod.GET, path = "/ola")
    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola() {
        return "Olá Spring Boot!!!!!!!";
    }

//    @PostMapping(path = "/saudacao")
//    public String saudacao() {
//        return "Olá Spring (POST)";
//    }

}
