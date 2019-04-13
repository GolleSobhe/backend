package com.hunter.job.repositories;

import com.hunter.job.domain.Candidat;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by telly on 18/02/18.
 */
@Transactional
@Repository
public class CandidatRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Candidat save(Candidat candidat){
        entityManager.persist(candidat);
        return candidat;
    }


    public Candidat findById(Long candidatId) {
        return entityManager.find(Candidat.class,candidatId);
    }

    public List<Candidat> findAll() {
        Query query = this.entityManager.createQuery("SELECT candidat FROM Candidat candidat order by candidat.nom asc ");
        return (List<Candidat>) query.getResultList();
    }

    public Candidat update(Candidat candidat) {
        entityManager.merge(candidat);
        return candidat;
    }
}
