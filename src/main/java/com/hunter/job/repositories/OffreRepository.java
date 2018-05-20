package com.hunter.job.repositories;

import com.hunter.job.domain.Offre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OffreRepository extends PagingAndSortingRepository<Offre, Long> {

    Page<Offre> findByPaysAndVilleAndTitreLike(Pageable pageable);

    Page<Offre> findByPaysAndVille(Pageable pageable);

    Page<Offre> findByPaysAndTitreLike(Pageable pageable);

    Page<Offre> findByPays(Pageable pageable);

    Page<Offre> findByVilleAndTitreLike(Pageable pageable);

    Page<Offre> findByVille(Pageable pageable);

    Page<Offre> findByTitreLike(Pageable pageable);
}
