package com.robson.controller;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robson.model.Operacao;
import com.robson.repository.OperacaoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/operacoes")
@AllArgsConstructor
public class OperacaoController {
    
    private OperacaoRepository operacaoRepository;

    @GetMapping    
    public List<Operacao> list(){
        return operacaoRepository.findAll();
    }

}
