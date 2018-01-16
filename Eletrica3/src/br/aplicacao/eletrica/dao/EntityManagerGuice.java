package br.aplicacao.eletrica.dao;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;

import br.aplicacao.eletrica.uteis.ApplicationInitializer;

public class EntityManagerGuice {

	public static final String PU_NAME = "eletricaPU";
	private Injector injector;
	private static EntityManagerGuice instance;

	private EntityManagerGuice() {
		injector = Guice.createInjector(new JpaPersistModule(PU_NAME));
		injector.getInstance(ApplicationInitializer.class);

	}

	public static synchronized EntityManagerGuice getInstance() {
		if (instance == null) {
			instance = new EntityManagerGuice();
		}
		return instance;
	}

	public Injector getInjector() {
		return injector;
	}
}
