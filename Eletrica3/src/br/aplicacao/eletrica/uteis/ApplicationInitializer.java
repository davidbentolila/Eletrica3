package br.aplicacao.eletrica.uteis;

import com.google.inject.Inject;
import com.google.inject.persist.PersistService;

public class ApplicationInitializer {
	@Inject
	ApplicationInitializer(PersistService persistenceService) {
		// start JPA
		persistenceService.start();
	}
}
