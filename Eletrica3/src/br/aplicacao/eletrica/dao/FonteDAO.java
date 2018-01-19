package br.aplicacao.eletrica.dao;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.aplicacao.eletrica.modelo.projeto.Fonte;

public class FonteDAO extends AbstractDAO<Fonte> {

	public FonteDAO() {
		super(Fonte.class);
	}

	public Fonte getByName(String nome) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Fonte> cq = cb.createQuery(Fonte.class);
		Root<Fonte> fonte = cq.from(Fonte.class);
		Predicate cond1 = cb.equal(fonte.get("nome"), nome);
		cq.where(cond1);
		try {
			return getEntityManager().createQuery(cq).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
