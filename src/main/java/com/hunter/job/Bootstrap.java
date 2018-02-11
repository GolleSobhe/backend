package com.hunter.job;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.domain.Offre;
import com.hunter.job.services.EntrepriseService;
import com.hunter.job.services.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by telly on 28/01/18.
 */
@Component
public class Bootstrap {

    @Autowired
    private EntrepriseService entrepriseService;

    @Autowired
    private OffreService offreService;

    @PostConstruct
    public void init() {
        Entreprise e = new Entreprise();
        Entreprise e2 = new Entreprise();
        Entreprise e3 = new Entreprise();

        Entreprise e4 = new Entreprise();
        Entreprise e5 = new Entreprise();
        Entreprise e6 = new Entreprise();

        Offre offre1 = new Offre();
        Offre offre2 = new Offre();
        Offre offre3 = new Offre();
        Offre offre4 = new Offre();


        //Entreprise
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

        //Offre
        offre1.setNom("developpeur en c");
        offreService.creerOffre(offre1);

        offre2.setNom("soudeur");
        offreService.creerOffre(offre2);

        offre3.setNom("vendeur");
        offreService.creerOffre(offre3);

        offre4.setNom("chauffeur");
        offreService.creerOffre(offre4);

    }
}
