package com.hunter.job.repositories;

import com.hunter.job.domain.ModelBasique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryBasique <T extends ModelBasique> extends JpaRepository<T, Long> {
}
