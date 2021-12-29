package com.emprestimo.resources;

import com.emprestimo.entidades.Pessoa;
import com.emprestimo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {

    /**
     * Injeção de dependecia*/
    @Autowired
    private PessoaService service;

    /**
     *Listar todas as pessoas*/
    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll(){
        List<Pessoa> List = service.findAll();
        return ResponseEntity.ok().body(List);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable Long id){
        Pessoa obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Pessoa> insert(@RequestBody Pessoa obj){
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }


}