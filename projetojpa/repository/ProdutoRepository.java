package com.projetojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetojpa.entites.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	// Nenhuma implementação é necessaria. Spring Data JPA cuidára disso 
}
