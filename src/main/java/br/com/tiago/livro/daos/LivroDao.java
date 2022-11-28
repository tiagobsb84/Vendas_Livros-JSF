package br.com.tiago.livro.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.tiago.livro.model.Livro;

public class LivroDao {

	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Livro livro) {
		manager.getTransaction().begin();
		manager.persist(livro);
		manager.getTransaction().commit();
	}
}
