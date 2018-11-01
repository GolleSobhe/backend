package com.hunter.job.services;

import com.hunter.job.domain.Candidat;
import com.hunter.job.repositories.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by telly on 18/02/18.
 */
@Service
public class CandidatService {

    @Autowired
    private CandidatRepository candidatRepository;

    public Candidat save(Candidat candidat){
        return this.candidatRepository.save(candidat);
    }

    public Candidat findById(Long candidatId) {
        return candidatRepository.findById(candidatId);
    }
}
