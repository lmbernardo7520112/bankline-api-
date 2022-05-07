package com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.service;

import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.model.Conta;
import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.model.Correntista;
import org.springframework.stereotype.Service;

@Service
public class CorrentistaService {
    public void  save(NovoCorrentista novoCorrentista) {
        Correntista correntista = new Correntista();
        correntista.setCpf(novoCorrentista.getCpf());
        correntista.setNome(novoCorrentista.getNome());

        Conta conta = new Conta();
        conta.setSaldo(0.0);

        correntista.setConta(null);
    }
}
