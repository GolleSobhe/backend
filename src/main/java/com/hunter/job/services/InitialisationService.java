package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.domain.Offre;
import com.hunter.job.domain.TypeContrat;
import com.hunter.job.dto.OffreDto;
import com.hunter.job.repositories.CandidatRepository;
import com.hunter.job.repositories.EntrepriseRepository;
import com.hunter.job.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by telly on 27/05/18.
 */
@Service
public class InitialisationService {

    @Autowired
    private OffreRepository offreRepository;
    @Autowired
    private EntrepriseRepository entrepriseRepository;


    @Autowired
    private CandidatRepository  candidatRepository;

    private Entreprise cbg;
    private Entreprise seg;
    private Entreprise fiyaHollo;

    public void init(){
        initEntreprises();
        initOffres();
    }

    private void initEntreprises(){
        cbg = new Entreprise("CBG", "62200000", "pamelap", "cbg@net.com", "https://fr.pamelap.com/", "compagnie de mines", "Mine");
        seg = new Entreprise("SEG","62200000","Conakry","seg@net.com","https://fr.seg.com/","compagnie dee eaux","Eaux");
        fiyaHollo = new Entreprise("fiyaHollo","07458000","Mamou","fiyaHollo@net.com","https://fr.fiyaHollo.com/","Informatique","Informatique");
        cbg.setId(UUID.randomUUID());
        entrepriseRepository.save(cbg);
        seg.setId(UUID.randomUUID());
        entrepriseRepository.save(seg);
        fiyaHollo.setId(UUID.randomUUID());
        entrepriseRepository.save(fiyaHollo);
    }

    private void initOffres(){
        List<String> competences = new ArrayList<>();
        competences.add("Java");
        OffreDto dto = new OffreDto("Developpeur","coder",1000L,"Labe","bon",
                "mines",3, competences,TypeContrat.CDD);
        Offre cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gWelcome to Angular! Angular helps you build modern applications for the web, mobile, or desktop. This guide shows you how to build and run a simple Angular app. You'll use the Angular CLI tool to accelerate developmenterer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        Offre segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","codWelcome to Angular! Angular helps you build modern applications for the web, mobile, or desktop. This guide shows you how to build and run a simple Angular app. You'll use the Angular CLI tool to accelerate developmenter",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Labe","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","Welcome to Angular! Angular helps you build modern applications for the web, mobile, or desktop. This guide shows you how to build and run a simple Angular app. You'll use the Angular CLI tool to accelerate development",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Labe","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","Welcome to Angular! Angular helps you build modern applications for the web, mobile, or desktop. This guide shows you how to build and run a simple Angular app. You'll use the Angular CLI tool to accelerate development",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Labe","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);

        competences = new ArrayList<>();
        competences.add("Java");
        dto = new OffreDto("Developpeur","coder",1000L,"Conakry","bon",
                "mines",3, competences,TypeContrat.CDD);
        cbgInformaticien = new Offre(dto,cbg);

        competences = new ArrayList<>();
        competences.add("Efficace");
        dto = new OffreDto("Comptable","gerer l'argent",111000L,"Conakry","Manager",
                "Eau",5,competences,TypeContrat.CDI);
        segComptable = new Offre(dto,seg);

        offreRepository.save(cbgInformaticien);
        offreRepository.save(segComptable);
    }


}
