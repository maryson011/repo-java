package com.maryson.exerciciosmvc.controllers;

import com.maryson.exerciciosmvc.model.entities.Produto;
import com.maryson.exerciciosmvc.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired // injeção de dependência
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(
            @RequestParam String nome,
            @RequestParam double preco,
            @RequestParam double desconto
    ) {
        Produto produto = new Produto(nome, preco, desconto);
        produtoRepository.save(produto);
        return produto;
    }

    @PostMapping("/produto2")
    public @ResponseBody Produto novoProduto2(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
}
