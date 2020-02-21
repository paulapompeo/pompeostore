package br.pompeo.store.dao;

import br.pompeo.store.bean.Usuario;

public interface UsuarioDAO {

	boolean validarUsuario(Usuario usuario);
	
}