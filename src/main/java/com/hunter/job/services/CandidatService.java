package com.hunter.job.services;

import com.hunter.job.domain.Candidat;
import com.hunter.job.domain.VerificationToken;
import com.hunter.job.repositories.CandidatRepository;
import com.hunter.job.repositories.VerificationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by telly on 18/02/18.
 */
@Service
public class CandidatService {

    @Autowired
    private CandidatRepository candidatRepository;

    @Autowired
    private VerificationTokenRepository verificationTokenRepository;

    @Autowired
    private MailService mailService;

    public Candidat findById(Long candidatId) {
        return candidatRepository.findById(candidatId);
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
        Candidat savedCandidat = candidatRepository.save(candidat);
        sendConfirmationEmail(savedCandidat);
        return savedCandidat;
    }

    private void sendConfirmationEmail(Candidat candidat){
        String token = UUID.randomUUID().toString();
        LocalDateTime dateExpirationToken = LocalDateTime.now().plusDays(1);
        VerificationToken verificationToken = new VerificationToken(token,dateExpirationToken,candidat);
        VerificationToken savedToken = verificationTokenRepository.save(verificationToken);
        mailService.sendVerificationEmail(savedToken.getToken(),candidat.getEmail());
    }


}
