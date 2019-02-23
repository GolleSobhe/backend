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

    public Offre findById(Long offreId) {
        return entityManager.find(Offre.class,offreId);
    }

    public List<Offre> findAll(){
        TypedQuery<Offre> query = entityManager.createQuery("select o from Offre o",Offre.class);
        return query.getResultList();
    }

    public Page<Offre> findByPage(Pageable pageable){
        String sqlQuery = "select o from Offre o";
        TypedQuery<Offre> selectQuery = createSelectQueryWithSqlAndPageable(sqlQuery,pageable);
        Query sizeQuery = entityManager.createQuery("select count(*) from Offre o");
        return createPageWithQueries(selectQuery,sizeQuery,pageable);
    }

    public Page<Offre> findByLieu(String lieu,Pageable pageable){
        String sqlQuery = "select o from Offre o where o.lieu =:lieu";
        TypedQuery<Offre> selectQuery = createSelectQueryWithSqlAndPageable(sqlQuery,pageable);
        selectQuery.setParameter("lieu",lieu);
        Query sizeQuery = entityManager.createQuery("select count(*) from Offre o where o.lieu =:lieu");
        sizeQuery.setParameter("lieu",lieu);
        return createPageWithQueries(selectQuery,sizeQuery,pageable);
    }

    public Page<Offre> findByTitre(String titre,Pageable pageable){
        String sqlQuery = "select o from Offre o where o.titre =:titre";
        TypedQuery<Offre> selectQuery = createSelectQueryWithSqlAndPageable(sqlQuery,pageable);
        selectQuery.setParameter("titre",titre);
        Query sizeQuery = entityManager.createQuery("select count(*) from Offre o where o.titre =:titre");
        sizeQuery.setParameter("titre",titre);
        return createPageWithQueries(selectQuery,sizeQuery,pageable);
    }

    public Page<Offre> findByLieuAndTitre(String lieu,String titre,Pageable pageable){
        String sqlQuery = "select o from Offre o where o.lieu =:lieu and o.titre =:titre";
        TypedQuery<Offre> selectQuery = createSelectQueryWithSqlAndPageable(sqlQuery,pageable);
        selectQuery.setParameter("lieu",lieu);
        selectQuery.setParameter("titre",titre);
        Query sizeQuery = entityManager.createQuery("select count(*) from Offre o where o.lieu =:lieu and o.titre =:titre");
        sizeQuery.setParameter("lieu",lieu);
        sizeQuery.setParameter("titre",titre);
        return createPageWithQueries(selectQuery,sizeQuery,pageable);
    }

    private TypedQuery<Offre> createSelectQueryWithSqlAndPageable(String sqlQuery,Pageable pageable){
        TypedQuery<Offre> selectQuery = entityManager.createQuery(sqlQuery,Offre.class);
        selectQuery.setFirstResult(pageable.getOffset());
        selectQuery.setMaxResults(pageable.getPageSize());
        return selectQuery;
    }

    private Page<Offre> createPageWithQueries(TypedQuery<Offre> selectQuery,Query sizeQuery,Pageable pageable){
        List<Offre> offres = selectQuery.getResultList();
        if(offres.size() != 0 && pageable.getPageSize() > offres.size()){
            return new PageImpl<>(offres,pageable,(long) pageable.getOffset()+offres.size());
        }
        return new PageImpl<>(offres,pageable,getSizeWithQuery(sizeQuery));
    }

    private Long getSizeWithQuery(Query query){
        return (Long) query.getSingleResult();
    }


}
