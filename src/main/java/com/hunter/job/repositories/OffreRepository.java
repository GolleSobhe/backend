package com.hunter.job.repositories;

import com.hunter.job.domain.Offre;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class OffreRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public Offre save(Offre offre){
        entityManager.persist(offre);
        return offre;
    }

}
