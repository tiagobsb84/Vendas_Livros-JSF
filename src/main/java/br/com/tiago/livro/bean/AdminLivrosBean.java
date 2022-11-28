package br.com.tiago.livro.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.tiago.livro.model.Livro;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class AdminLivrosBean implements Serializable {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public void salvar() {
		System.out.println("Livro cadastrado: " + this.livro.toString());
	}
}
