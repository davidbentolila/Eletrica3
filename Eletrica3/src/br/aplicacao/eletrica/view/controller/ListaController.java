package br.aplicacao.eletrica.view.controller;

import java.awt.Component;

import javax.swing.JTable;

import br.aplicacao.eletrica.modelo.projeto.Entidade;
import br.aplicacao.eletrica.view.Detalhe;

public interface ListaController<T extends Entidade> {

	Detalhe abrirDetalhe(T e);

	void excluir(T e);

	void configureTabela(JTable table1);

	int getColunaID();

	T criarEntidade();

	void salvarDetalhe();

	Component getPainel();

	void setEntidade(T entidade);

	T getProjeto(Integer id);

}
