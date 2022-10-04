package com.robson.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Operacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 20, nullable = false)
    private String categoria;
    @Column(length = 250)
    private String descricao;
    @Column(length = 15, nullable = false)
    private BigDecimal valor;
    
    
}
