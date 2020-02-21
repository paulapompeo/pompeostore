package br.pompeo.store.factory;

import br.pompeo.store.dao.CategoriaDAO;
import br.pompeo.store.dao.ProdutoDAO;
import br.pompeo.store.dao.UsuarioDAO;
import br.pompeo.store.dao.impl.OracleCategoriaDAO;
import br.pompeo.store.dao.impl.OracleProdutoDAO;
import br.pompeo.store.dao.impl.OracleUsuarioDAO;

public class DAOFactory {

	public static ProdutoDAO getProdutoDAO() {
		return new OracleProdutoDAO();
	}
	
	public static CategoriaDAO getCategoriaDAO() {
		return new OracleCategoriaDAO();
	}
	
	public static UsuarioDAO getUsuarioDAO() {
		return new OracleUsuarioDAO();
	}
	
}