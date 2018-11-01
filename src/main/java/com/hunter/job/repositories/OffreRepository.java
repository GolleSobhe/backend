package com.hunter.job.repositories;

import com.hunter.job.domain.Offre;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class OffreRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public Offre save(Offre offre){
        entityManager.persist(offre);
        return offre;
    }

    public List<Offre> findAll(){
        TypedQuery<Offre> query = entityManager.createQuery("select o from Offre o",Offre.class);
        return query.getResultList();
    }

    public Offre findById(Long offreId) {
        return entityManager.find(Offre.class,offreId);
    }
}
