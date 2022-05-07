package com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.repository;

import com.dio.santanderlmb.bankline.api.model.com.dio.santander.bankline.api.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
}
