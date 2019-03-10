package com.hunter.job.repositories;

import com.hunter.job.domain.Entreprise;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

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

    public Entreprise findById(Long id){
        return  entityManager.find(Entreprise.class,id);
    }

    public Entreprise update(Entreprise entreprise) {
        Entreprise update = findById(entreprise.getId());
        update.setNom(entreprise.getNom());
        update.setTelephone(entreprise.getTelephone());
        update.setAdresse(entreprise.getAdresse());
        update.setEmail(entreprise.getEmail());
        update.setSiteWeb(entreprise.getSiteWeb());
        update.setDescription(entreprise.getDescription());
        update.setSecteurActivite(entreprise.getSecteurActivite());
        entityManager.flush();
        return update;
    }
}
