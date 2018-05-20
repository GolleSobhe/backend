package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by telly on 28/01/18.
 */
@Service
public class BootstrapService {

    @Autowired
    private EntrepriseService entrepriseService;


}
