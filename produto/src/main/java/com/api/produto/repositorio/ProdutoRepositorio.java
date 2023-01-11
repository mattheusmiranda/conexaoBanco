package com.api.produto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.produto.ProdutoModelo;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Integer>{

	// Listar todos os produtos

	
	// Pesquisar por codigo
	ProdutoModelo findByCodigo(int codigo);
	
	// Remover produtos
	
	// Cadastrar/Alterar produtos
	
	 
}
