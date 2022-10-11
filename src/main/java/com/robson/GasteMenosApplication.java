package com.robson;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.robson.model.Operacao;
import com.robson.repository.OperacaoRepository;

@SpringBootApplication
public class GasteMenosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GasteMenosApplication.class, args);
	}

	@Bean
    CommandLineRunner initDatabase(OperacaoRepository operacaoRepository) {
        return args -> {
            operacaoRepository.deleteAll();

            Operacao operacao = new Operacao();
            operacao.setCategoria("Despesa");
            operacao.setDescricao("teste");
            operacao.setValor(new BigDecimal(10));
            operacaoRepository.save(operacao);
        };
    }
}
