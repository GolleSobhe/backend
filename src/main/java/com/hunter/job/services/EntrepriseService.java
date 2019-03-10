package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;


/**
 * Created by telly on 28/01/18.
 */
@Service
@Transactional
public class EntrepriseService {

    @PersistenceContext
    private EntityManager entityManager;

    public Entreprise save(Entreprise entreprise){
        this.entityManager.persist(entreprise);
        return entreprise;
    }

    public List<Entreprise> findAll() {
        Query query = this.entityManager.createQuery("SELECT entreprise FROM Entreprise entreprise order by entreprise.nom asc ");
        return (List<Entreprise>) query.getResultList();
    }

    public Entreprise findById(Long id){
        return this.entityManager.find(Entreprise.class, id);
    }

    public void remove(Entreprise entreprise) {
        Entreprise removed = this.entityManager.getReference(Entreprise.class, entreprise.getId());
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
