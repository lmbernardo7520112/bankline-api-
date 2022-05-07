package com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.controller;


import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.model.Correntista;
import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository repository;

    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }
}