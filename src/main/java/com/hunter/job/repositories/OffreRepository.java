package com.hunter.job.repositories;

import com.hunter.job.domain.Offre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OffreRepository extends PagingAndSortingRepository<Offre, Long> {

    Page<Offre> findByPaysAndVilleAndTitreIgnoreCaseContaining(String pays,String ville,String titre,Pageable pageable);

    Page<Offre> findByPaysAndVille(String pays,String ville,Pageable pageable);

    Page<Offre> findByPaysAndTitreIgnoreCaseContaining(String pays,String titre,Pageable pageable);

    Page<Offre> findByPays(String pays,Pageable pageable);

    Page<Offre> findByVilleAndTitreIgnoreCaseContaining(String ville,String titre,Pageable pageable);

    Page<Offre> findByVille(String ville,Pageable pageable);

    Page<Offre> findByTitreIgnoreCaseContaining(String titre,Pageable pageable);

    Page<Offre> findAll(Pageable pageable);
}
