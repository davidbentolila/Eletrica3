package br.aplicacao.eletrica.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.aplicacao.eletrica.view.Principal;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		new Principal();
	}
	
}
