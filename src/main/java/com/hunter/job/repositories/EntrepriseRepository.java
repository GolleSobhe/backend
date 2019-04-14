package com.hunter.job.repositories;

import com.hunter.job.domain.Entreprise;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

/**
 * Created by telly on 28/01/18.
 */
@Repository
@Transactional
public class EntrepriseRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Entreprise> findAll(){
        TypedQuery<Entreprise> query = entityManager.createQuery("select e from Entreprise e",Entreprise.class);
        return query.getResultList();
    }

    public Entreprise save(Entreprise entreprise){
        entityManager.persist(entreprise);
        return entreprise;
    }

    public Entreprise findById(UUID id){
        return  entityManager.find(Entreprise.class,id);
    }

    public Entreprise update(Entreprise entreprise) {
        entityManager.merge(entreprise);
        return entreprise;
    }
}
