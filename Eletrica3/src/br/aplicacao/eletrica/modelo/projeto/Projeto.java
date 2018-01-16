package br.aplicacao.eletrica.modelo.projeto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Projeto implements Entidade<Projeto> {

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String autor;
	private String descricao;
	@Temporal(TemporalType.DATE)
	private Calendar data;

	///@OneToMany
//private List<Fonte> fontes;

	public Projeto() {
		//fontes = new ArrayList<>();
	}

	public Projeto(String nome, Calendar data, String autor, String descricao) {
		this();
		this.nome = nome;
		this.data = data;
		this.autor = autor;
		this.descricao = descricao;
	}

	public Projeto(String nome) {

		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public Projeto clonarSemID() {
		Projeto p = copiar();
		p.setId(null);
		return p;
	}

	@Override
	public Projeto copiar() {
		Projeto p = new Projeto();
		p.setId(id);
		p.setNome(nome);
		p.setAutor(autor);
		p.setData(data);
		p.setDescricao(descricao);
		return p;
	}
}
