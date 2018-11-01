package com.hunter.job.repositories;

import com.hunter.job.domain.Candidature;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by telly on 28/10/18.
 */
@Repository
@Transactional
public class CandidatureRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Candidature save(Candidature candidature){
        entityManager.persist(candidature);
        return candidature;
    }
}
