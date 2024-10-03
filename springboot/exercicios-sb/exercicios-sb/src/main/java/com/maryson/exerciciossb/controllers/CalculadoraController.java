package com.maryson.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    // /calculadora/somar/10/20
    @GetMapping("/somar/{n1}/{n2}")
    public Integer somar(@PathVariable int n1,@PathVariable int n2) {
        return n1 + n2;
    }
    // /calculadora/subtrair?a=10&b=20
    @GetMapping("/subtrair")
    public Integer subtrair(@RequestParam(name = "n1") int n1,@RequestParam(name = "n2") int n2) {
        return n1 - n2;
    }
}
