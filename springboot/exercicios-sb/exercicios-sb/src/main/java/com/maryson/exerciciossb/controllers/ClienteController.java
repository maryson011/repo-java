package com.maryson.exerciciossb.controllers;

import com.maryson.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(29, "Pedro", "123.234.345-56");
    }
}
