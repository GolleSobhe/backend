package com.hunter.job.services;

import com.hunter.job.domain.Candidat;
import com.hunter.job.domain.VerificationToken;
import com.hunter.job.repositories.CandidatRepository;
import com.hunter.job.repositories.VerificationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Created by telly on 18/02/18.
 */
@Service
@Transactional
public class CandidatService {

    @Autowired
    private CandidatRepository candidatRepository;

    @Autowired
    private VerificationTokenRepository verificationTokenRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private MailService mailService;

    public Candidat findById(Long id) {
        return entityManager.find(Candidat.class,id);
    }

    public String validateCandidat(String token){
        VerificationToken verificationToken = verificationTokenRepository.findByToken(token);
        if(verificationToken == null || verificationToken.getDateExpiration().isBefore(LocalDateTime.now())){
            return "bad";
        }
        Candidat candidat = verificationToken.getCandidat();
        candidat.validerCandidat();
        candidatRepository.save(candidat);
        verificationTokenRepository.delete(verificationToken);
        return "good";
    }

    public Candidat save(Candidat candidat){
        entityManager.persist(candidat);
        sendConfirmationEmail(candidat);
        return candidat;
    }

    private void sendConfirmationEmail(Candidat candidat){
        String token = UUID.randomUUID().toString();
        LocalDateTime dateExpirationToken = LocalDateTime.now().plusDays(1);
        VerificationToken verificationToken = new VerificationToken(token,dateExpirationToken,candidat);
        VerificationToken savedToken = verificationTokenRepository.save(verificationToken);
        mailService.sendVerificationEmail(savedToken.getToken(),candidat.getEmail());
    }


    public List<Candidat> findAll() {
        Query query = this.entityManager.createQuery("SELECT candidat FROM Candidat candidat order by candidat.nom asc ");
        return (List<Candidat>) query.getResultList();
    }

    public Candidat update(Long id, Candidat candidat) {
        Candidat currenCandidat = findById(id);
        currenCandidat.setNom(candidat.getNom());
        currenCandidat.setPrenom(candidat.getPrenom());
        currenCandidat.setEmail(candidat.getEmail());
        currenCandidat.setTelephone(candidat.getTelephone());
        currenCandidat.setTitreProfil(candidat.getTitreProfil());
        currenCandidat.setAdresse(candidat.getAdresse());
        currenCandidat.setAnneesExperiences(candidat.getAnneesExperiences());
        currenCandidat.setAnneesEtudes(candidat.getAnneesEtudes());
        currenCandidat.setSalaire(candidat.getSalaire());
        currenCandidat.setRelocalisation(candidat.getRelocalisation());
        currenCandidat.setCdi(candidat.getCdi());
        currenCandidat.setCdd(candidat.getCdd());
        currenCandidat.setStage(candidat.getStage());
        currenCandidat.setInterim(candidat.getInterim());
        currenCandidat.setApprentissage(candidat.getApprentissage());
        currenCandidat.setProfessionnalisation(candidat.getProfessionnalisation());
        currenCandidat.setFreelance(candidat.getFreelance());
        entityManager.merge(currenCandidat);
        return  currenCandidat;
    }
}
