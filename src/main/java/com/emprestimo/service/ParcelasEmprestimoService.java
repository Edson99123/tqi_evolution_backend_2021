package com.emprestimo.service;

import com.emprestimo.repository.ParcelasEmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParcelasEmprestimoService {

    @Autowired
    ParcelasEmprestimoRepository repository;


}
