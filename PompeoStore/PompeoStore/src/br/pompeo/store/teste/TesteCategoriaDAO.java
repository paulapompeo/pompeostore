package br.pompeo.store.teste;

import java.util.List;

import br.pompeo.store.bean.Categoria;
import br.pompeo.store.dao.CategoriaDAO;
import br.pompeo.store.factory.DAOFactory;

public class TesteCategoriaDAO {

	public static void main(String[] args) {
		CategoriaDAO dao = DAOFactory.getCategoriaDAO();

		List<Categoria> lista = dao.listar();
		for (Categoria categoria : lista) {
			System.out.println(categoria.getCodigo() + " " + categoria.getNome());
		}

	}

}
