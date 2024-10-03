package com.maryson.exerciciosmvc.controllers;

import com.maryson.exerciciosmvc.model.entities.Produto;
import com.maryson.exerciciosmvc.model.repositories.ProdutoRepository;
import com.maryson.exerciciosmvc.model.repositories.ProdutoRepositoryPaging;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired // injeção de dependência
    private ProdutoRepository produtoRepository;
    @Autowired
    private ProdutoRepositoryPaging produtoRepositoryPaging;

//    @PostMapping
//    public @ResponseBody Produto novoProduto(
//            @RequestParam String nome,
//            @RequestParam double preco,
//            @RequestParam double desconto
//    ) {
//        Produto produto = new Produto(nome, preco, desconto);
//        produtoRepository.save(produto);
//        return produto;
//    }

//    @PostMapping("/produto2")
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
    public Iterable<Produto> obterProdutosPorPagina(
            @PathVariable int numeroPagina,
            @PathVariable int qtdePagina
    ) {
        if (qtdePagina >= 5) qtdePagina = 5;
        Pageable page = PageRequest.of(numeroPagina,qtdePagina);
        return produtoRepositoryPaging.findAll(page);
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
//    }

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }

}
