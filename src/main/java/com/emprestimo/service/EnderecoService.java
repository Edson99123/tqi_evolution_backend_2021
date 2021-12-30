package com.emprestimo.service;

import com.emprestimo.entidades.Endereco;
import com.emprestimo.entidades.Pessoa;
import com.emprestimo.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository repository;


    public List<Endereco> findAll(){
        return repository.findAll();
    }

    public Endereco findById(Long id){
        Optional<Endereco> obj = repository.findById(id);
        return obj.get();
    }

    /**
     *Metodo insert de pessoa*/
    public Endereco insert(Endereco obj){
        return repository.save(obj);
    }

}
