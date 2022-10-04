package com.robson.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.robson.model.Operacao;

@Repository
public interface OperacaoRepository extends JpaRepository<Operacao, Long> {
    
}
