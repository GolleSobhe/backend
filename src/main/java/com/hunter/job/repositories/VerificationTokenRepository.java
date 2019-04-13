package com.hunter.job.repositories;

import com.hunter.job.domain.VerificationTokenCandidat;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Repository
@Transactional
public class VerificationTokenRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public VerificationTokenCandidat save(VerificationTokenCandidat verificationTokenCandidat){
        entityManager.persist(verificationTokenCandidat);
        return verificationTokenCandidat;
    }

    public void delete(VerificationTokenCandidat verificationTokenCandidat){
        entityManager.remove(verificationTokenCandidat);
    }

    public VerificationTokenCandidat findByToken(String token){
        TypedQuery<VerificationTokenCandidat> query = entityManager.createQuery("select v from VerificationTokenCandidat v where token =:token", VerificationTokenCandidat.class);
        query.setParameter("token",token);
        try {
            return  query.getSingleResult();
        }catch (NoResultException e){
            return  null;
        }

    }

}
