package br.aplicacao.eletrica.modelo.projeto;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Fonte implements Entidade<Fonte> {

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private double tensaoFN;
	private String concessionaria;
	private List<Quadro> quadros;

	public Fonte() {

	}

	public Fonte(String nome, double tensaoFN, String concessionaria, List<Quadro> quadros) {
		this();
		this.nome = nome;
		this.tensaoFN = tensaoFN;
		this.concessionaria = concessionaria;
		this.quadros = quadros;
	}

	public Fonte(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTensaoFN() {
		return tensaoFN;
	}

	public void setTensaoFN(double tensaoFN) {
		this.tensaoFN = tensaoFN;
	}

	public String getConcessionaria() {
		return concessionaria;
	}

	public void setConcessionaria(String concessionaria) {
		this.concessionaria = concessionaria;
	}

	public List<Quadro> getQuadros() {
		return quadros;
	}

	public void setQuadros(List<Quadro> quadros) {
		this.quadros = quadros;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public Fonte clonarSemID() {
		Fonte fonte = new Fonte();
		fonte.setId(null);
		return fonte;
	}

	@Override
	public Fonte copiar() {
		Fonte fonte = new Fonte();
		fonte.setId(id);
		fonte.setNome(nome);
		fonte.setTensaoFN(tensaoFN);
		fonte.setConcessionaria(concessionaria);
		return fonte;
	}

}
