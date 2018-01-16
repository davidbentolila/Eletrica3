package br.aplicacao.eletrica.calculo;

import br.aplicacao.eletrica.modelo.projeto.Equipamento;
import br.aplicacao.eletrica.modelo.projeto.Projeto;

public class PotenciaInstalada {
	
	private double total;
	private Equipamento equipamento;

	public PotenciaInstalada(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	public void calculo() {
		for(int i =0; i< equipamento.get) {
			
		}
	}
	
	public void add(double potW) {
		total += potW;
	}
	
	public double getTotal() {
		return total;
	}

}
