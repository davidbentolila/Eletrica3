package br.aplicacao.eletrica.uteis;

import java.util.Calendar;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;

import br.aplicacao.eletrica.dao.EntityManagerGuice;
import br.aplicacao.eletrica.dao.ProjetoDAO;
import br.aplicacao.eletrica.modelo.projeto.Projeto;

public class GerarTabelas {
	public static final String PU_NAME = "eletricaPU";
	private static ProjetoDAO projetoDAO;

	public static void main(String[] args) {
		Injector injector = EntityManagerGuice.getInstance().getInjector();
		projetoDAO = injector.getInstance(ProjetoDAO.class);

		Projeto p = projetoDAO.getByName("projeto1");
		System.out.println( p == null ? null : p.getDescricao());
		/*
		 * Projeto pp = new Projeto(); pp.setDescricao("nova descricao");
		 * pp.setAutor("bentolila"); pp.setData(Calendar.getInstance());
		 * pp.setNome("Novo Projeto"); projetoDAO.create(pp);
		 * 
		 * 
		 * 
		 * p = projetoDAO.getByName("Novo Projeto");
		 * System.out.println(p.getDescricao());
		 * 
		 * /* try { logger.log(Level.INFO, "Populating DB.."); populateDb(); } catch
		 * (SQLException e) { logger.log(Level.SEVERE,
		 * "There was an error while populating db.. ", e); }
		 * 
		 * logger.log(Level.INFO, "Querying DB for person with name Person 2.."); //
		 * retrieve one person from the persisted people Person retrieved =
		 * personDao.getByName("Person 2"); logger.log(Level.INFO, "Retrieved " +
		 * retrieved.getName());
		 * 
		 * injector.getInstance(OtherExample.class).run();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * EntityManagerFactory factory =
		 * Persistence.createEntityManagerFactory("eletricaPU");
		 * 
		 * factory.close();
		 */
	}
}
