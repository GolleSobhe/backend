package com.hunter.job.repositories;

import com.hunter.job.domain.Entreprise;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by telly on 28/01/18.
 */
@Repository
public interface EntrepriseRepository extends PagingAndSortingRepository<Entreprise,Long>{
}
