package com.hunter.job.repositories;

import com.hunter.job.domain.ModelBasique;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RepositoryBasique <T extends ModelBasique> extends PagingAndSortingRepository<T, Long> {
}
