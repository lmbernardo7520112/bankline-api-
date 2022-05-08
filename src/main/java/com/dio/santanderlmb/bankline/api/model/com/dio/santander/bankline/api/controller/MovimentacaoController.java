package com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.controller;


import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.model.Correntista;
import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.repository.MovimentacaoRepository;
import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository repository;



    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista) {
        service.save(correntista);

    }
}