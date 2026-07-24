package com.generation.fithubdelivery.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.fithubdelivery.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByProdutoContainingIgnoreCase(String produto);

	public List<Produto> findAllByValorGreaterThanOrderByValor(BigDecimal valor);

	public List<Produto> findAllByValorLessThanOrderByValorDesc(BigDecimal valor);

	public List<Produto> findAllByCaloriasGreaterThanOrderByCalorias(BigDecimal calorias);

	public List <Produto> findAllByCaloriasLessThanOrderByCaloriasDesc(BigDecimal calorias);

}