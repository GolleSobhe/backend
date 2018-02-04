package com.hunter.job.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitializationService {

    private EntrepriseService entrepriseService;

    @Autowired
    public InitializationService(EntrepriseService entrepriseService) {
        this.entrepriseService = entrepriseService;
    }


    public void initialiserEntreprise() {
       // this.entrepriseService.initEntreprises();
    }
}
