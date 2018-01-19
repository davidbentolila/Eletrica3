package br.aplicacao.eletrica.calculo;

public class CalculoPredial {
	
	private double demanda;
	private double fd;
	private double potenciaInstalada;
	
	

	public CalculoPredial() {
		
		
	}
	
	public void demanda(ArrayList<double> pot) {
		Demanda demanda = new Demanda();
		for(double potencia: pot) {
		demanda.add(potencia, potencia);
		}
		}
	}
	
	

}
