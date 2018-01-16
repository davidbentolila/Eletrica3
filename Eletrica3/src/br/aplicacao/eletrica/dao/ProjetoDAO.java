package br.aplicacao.eletrica.dao;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.aplicacao.eletrica.modelo.projeto.Projeto;

public class ProjetoDAO extends AbstractDAO<Projeto> {

	public ProjetoDAO() {
		super(Projeto.class);
	}

	public Projeto getByName(String nome) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Projeto> cq = cb.createQuery(Projeto.class);
		Root<Projeto> projeto = cq.from(Projeto.class);

		Predicate cond1 = cb.equal(projeto.get("nome"), nome);
		cq.where(cond1);

		try {
			return getEntityManager().createQuery(cq).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
