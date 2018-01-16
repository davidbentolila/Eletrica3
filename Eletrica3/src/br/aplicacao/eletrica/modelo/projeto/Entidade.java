package br.aplicacao.eletrica.modelo.projeto;

public interface Entidade<T extends Entidade> {

	Integer getId();

	T clonarSemID();

	T copiar();
	
}
