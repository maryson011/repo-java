package com.maryson.exerciciossb.controllers;

import com.maryson.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(29, "Pedro", "123.234.345-56");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "897.435.234-90");
    }

    @GetMapping
    public Cliente obterClienteProId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "João", "123.234.345-45");
    }
}
