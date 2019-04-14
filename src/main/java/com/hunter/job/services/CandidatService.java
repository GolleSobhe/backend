package com.hunter.job.services;

import com.hunter.job.domain.Candidat;
import com.hunter.job.domain.VerificationToken;
import com.hunter.job.repositories.CandidatRepository;
import com.hunter.job.repositories.VerificationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    @Autowired
    private MailService mailService;

    public Candidat save(Candidat candidat){
        UUID id = UUID.randomUUID();
        candidat.setId(id);
        Candidat savedCandidat = candidatRepository.save(candidat);
        return savedCandidat;
    }

    public void sendConfirmationEmail(Candidat candidat,String url){
        String token = UUID.randomUUID().toString();
        LocalDateTime dateExpirationToken = LocalDateTime.now().plusDays(1);
        VerificationToken verificationToken = new VerificationToken(token,dateExpirationToken,candidat);
        VerificationToken savedToken = verificationTokenRepository.save(verificationToken);
        mailService.sendVerificationEmail(url,savedToken.getToken(),candidat.getEmail());
    }

    public String connect(String email, String password) {
        Candidat c = candidatRepository.findByEmailAndPassword(email,password);
        if(c == null){
            return "bad";
        }
        return "good";
    }

    public String validateCandidat(String token){
        VerificationToken verificationTokenCandidat = verificationTokenRepository.findByToken(token);
        if(verificationTokenCandidat == null || verificationTokenCandidat.getDateExpiration().isBefore(LocalDateTime.now())){
            return "bad";
        }
        Candidat candidat = verificationTokenCandidat.getCandidat();
        candidat.validerCandidat();
        candidatRepository.save(candidat);
        verificationTokenRepository.delete(verificationTokenCandidat);
        return "good";
    }

    public Candidat findById(UUID id) {
        return candidatRepository.findById(id);
    }

    public Candidat update(Candidat candidat) {
        Candidat currenCandidat = findById(candidat.getId());
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
        return  candidatRepository.update(currenCandidat);
    }

    public List<Candidat> findAll() {
        return candidatRepository.findAll();
    }


}
