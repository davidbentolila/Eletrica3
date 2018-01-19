package br.aplicacao.eletrica.view.controller;

import java.awt.Component;
import java.util.Calendar;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.aplicacao.eletrica.dao.EntityManagerGuice;
import br.aplicacao.eletrica.dao.ProjetoDAO;
import br.aplicacao.eletrica.modelo.projeto.Projeto;
import br.aplicacao.eletrica.view.Detalhe;

public class ProjetoController implements ListaController<Projeto> {
	private Projeto p = new Projeto();

	@Override
	public Detalhe abrirDetalhe(Projeto p) {
		this.p = p;
		return new Detalhe(this);
	}

	@Override
	public void excluir(Projeto e) {
		// TODO Auto-generated method stub

	}

	private DefaultTableModel getModel() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Nome");
		// model.addColumn("Entidade");
		return model;
	}

	@Override
	public void configureTabela(JTable table) {
		DefaultTableModel model = getModel();

		ProjetoDAO projetoDAO = EntityManagerGuice.getInstance().getInjector().getInstance(ProjetoDAO.class);

		List<Projeto> projetos = projetoDAO.findAll();

		for (Projeto p : projetos) {
			model.addRow(new Object[] { p.getId(), p.getNome(), p });
		}

		table.setModel(model);
	}

	@Override
	public int getColunaID() {
		return 0;
	}

	@Override
	public Projeto criarEntidade() {
		Projeto p = new Projeto("");
		p.setData(Calendar.getInstance());
		p.setAutor("");
		p.setDescricao("");
		return p;
	}

	@Override
	public void salvarDetalhe() {
		ProjetoDAO projetoDAO = EntityManagerGuice.getInstance().getInjector().getInstance(ProjetoDAO.class);
		if (p.getId() == null) {
			projetoDAO.create(p);
		} else {
			projetoDAO.update(p);
		}

	}

	@Override
	public Component getPainel() {
		return new br.aplicacao.eletrica.view.projeto.Projeto(p);
	}

	@Override
	public void setEntidade(Projeto entidade) {
		this.p = entidade;
	}

	@Override
	public Projeto getProjeto(Integer id) {
		ProjetoDAO projetoDAO = EntityManagerGuice.getInstance().getInjector().getInstance(ProjetoDAO.class);
		return projetoDAO.find(id);
	}
}
