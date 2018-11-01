package com.hunter.job.services;

import com.hunter.job.domain.Candidature;
import com.hunter.job.repositories.CandidatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by telly on 28/10/18.
 */
@Service
public class CandidatureService {

    @Autowired
    private CandidatureRepository candidatureRepository;

    public Candidature save(Candidature candidature){
        return candidatureRepository.save(candidature);
    }
}
