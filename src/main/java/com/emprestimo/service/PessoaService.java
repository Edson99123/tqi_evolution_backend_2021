package com.emprestimo.service;


import com.emprestimo.entidades.Pessoa;
import com.emprestimo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository  repository;

    public List<Pessoa> findAll(){
        return repository.findAll();
    }

    public Pessoa findById(Long id){
        Optional<Pessoa> obj = repository.findById(id);
        return obj.get();
    }

    /**
     *Metodo insert de pessoa*/
    public Pessoa insert(Pessoa obj){
        return repository.save(obj);
    }



}
