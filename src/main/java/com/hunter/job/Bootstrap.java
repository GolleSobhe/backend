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

        Entreprise e4 = new Entreprise();
        Entreprise e5 = new Entreprise();
        Entreprise e6 = new Entreprise();

        e.setNom("Google");
        entrepriseService.creerEntreprise(e);

        e2.setNom("Orange");
        entrepriseService.creerEntreprise(e2);

        e3.setNom("Areeba");
        entrepriseService.creerEntreprise(e3);

        e4.setNom("Microsoft");
        entrepriseService.creerEntreprise(e);

        e5.setNom("Free");
        entrepriseService.creerEntreprise(e2);

        e6.setNom("SFR");
        entrepriseService.creerEntreprise(e3);
    }
}
