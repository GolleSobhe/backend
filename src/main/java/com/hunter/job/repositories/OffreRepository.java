package com.hunter.job.repositories;

import com.hunter.job.domain.Offre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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


    public Page<Offre> findByPage(Pageable pageable){
        TypedQuery<Offre> query = entityManager.createQuery("select o from Offre o",Offre.class);
        query.setFirstResult(pageable.getOffset());
        query.setMaxResults(pageable.getPageSize());
        List<Offre> content = query.getResultList();
        if(content.size() != 0 && pageable.getPageSize() > content.size()){
            return new PageImpl<>(content,pageable,pageable.getOffset()+content.size());
        }
        System.out.println(getSize());
        return new PageImpl<>(content,pageable,getSize());
    }

    private Long getSize(){
        Query query = entityManager.createQuery("select count(*) from Offre o");
        return (Long) query.getSingleResult();
    }

    public Offre findById(Long offreId) {
        return entityManager.find(Offre.class,offreId);
    }
}
