package com.generation.fithubdelivery.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.fithubdelivery.model.Produto;
import com.generation.fithubdelivery.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> recomendarProdutos(BigDecimal calorias) {
		return produtoRepository.findAllByCaloriasLessThanEqualOrderByCaloriasAsc(calorias);
	}
}
