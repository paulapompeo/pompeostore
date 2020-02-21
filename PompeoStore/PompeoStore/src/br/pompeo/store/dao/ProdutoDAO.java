package br.pompeo.store.dao;

import java.util.List;

import br.pompeo.store.bean.Produto;
import br.pompeo.store.exception.DBException;

public interface ProdutoDAO {
	
	void cadastrar(Produto produto) throws DBException;
	void atualizar(Produto produto) throws DBException;
	void remover(int codigo) throws DBException;
	Produto buscar(int id);
	List<Produto> listar();
}