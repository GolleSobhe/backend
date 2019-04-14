package com.hunter.job.repositories;

import com.hunter.job.domain.Candidat;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.UUID;

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


    public Candidat findById(UUID candidatId) {
        return entityManager.find(Candidat.class,candidatId);
    }

    public Candidat findByEmailAndPassword(String email,String password){
        TypedQuery<Candidat> query = entityManager.createQuery("Select c from Candidat c where c.email =:email " +
                        "and c.password =:password and c.estValide =:valide",Candidat.class);
        query.setParameter("email",email);
        query.setParameter("password",password);
        query.setParameter("valide",true);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }
}
