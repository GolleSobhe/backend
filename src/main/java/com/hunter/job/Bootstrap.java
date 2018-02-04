package com.hunter.job;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.services.EntrepriseService;
import com.hunter.job.services.InitializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by telly on 28/01/18.
 */
@Component
public class Bootstrap {

    @Autowired
    private EntrepriseService entrepriseService;

    @PostConstruct
    public void init() {
        Entreprise e = new Entreprise();
        Entreprise e2 = new Entreprise();
        Entreprise e3 = new Entreprise();

        e.setNom("entriprise1");
        entrepriseService.creerEntreprise(e);

        e2.setNom("entriprise2");
        entrepriseService.creerEntreprise(e2);

        e3.setNom("entriprise3");
        entrepriseService.creerEntreprise(e3);
    }
}
