package com.hunter.job.repositories;

import com.hunter.job.domain.Candidat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

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


}
