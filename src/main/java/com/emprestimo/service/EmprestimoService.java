package com.emprestimo.service;

import com.emprestimo.entidades.Emprestimo;
import com.emprestimo.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository repository;

    public List<Emprestimo> findAll(){
        return repository.findAll();
    }

    public Emprestimo findById(Long id){
        Optional<Emprestimo> obj = repository.findById(id);
        return obj.get();
    }

}
