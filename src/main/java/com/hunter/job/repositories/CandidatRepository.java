package com.hunter.job.repositories;

import com.hunter.job.domain.Candidat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by telly on 18/02/18.
 */
public interface CandidatRepository extends CrudRepository<Candidat, Long> {
}
