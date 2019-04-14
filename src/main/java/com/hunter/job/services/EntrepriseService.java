package com.hunter.job.services;

import com.hunter.job.domain.Entreprise;
import com.hunter.job.domain.VerificationToken;
import com.hunter.job.repositories.EntrepriseRepository;
import com.hunter.job.repositories.VerificationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


/**
 * Created by telly on 28/01/18.
 */
@Service
@Transactional
public class EntrepriseService {

    @Autowired
    EntrepriseRepository entrepriseRepository;

    @Autowired
    private VerificationTokenRepository verificationTokenRepository;


    @Autowired
    private MailService mailService;

    public Entreprise save(Entreprise entreprise, String url){
        entreprise.setId(UUID.randomUUID());
        Entreprise entrepriseSaved = entrepriseRepository.save(entreprise);
        sendConfirmationEmail(entrepriseSaved,url);
        return  entrepriseSaved;
    }

    public List<Entreprise> findAll() {
        return entrepriseRepository.findAll();
    }

    public Entreprise findById(UUID id){
        return entrepriseRepository.findById(id);
    }

    public Entreprise update(Entreprise entreprise) {
        Entreprise entrepriseUpdated = findById(entreprise.getId());
        entrepriseUpdated.setNom(entreprise.getNom());
        entrepriseUpdated.setTelephone(entreprise.getTelephone());
        entrepriseUpdated.setAdresse(entreprise.getAdresse());
        entrepriseUpdated.setEmail(entreprise.getEmail());
        entrepriseUpdated.setSiteWeb(entreprise.getSiteWeb());
        entrepriseUpdated.setDescription(entreprise.getDescription());
        entrepriseUpdated.setSecteurActivite(entreprise.getSecteurActivite());
        return entrepriseRepository.update(entrepriseUpdated);
    }


    public String validerEntreprise(String token) {
        VerificationToken verificationTokenEntreprise = verificationTokenRepository.findByToken(token);
        if(verificationTokenEntreprise == null || verificationTokenEntreprise.getDateExpiration().isBefore(LocalDateTime.now())){
            return "bad";
        }
        Entreprise entreprise = verificationTokenEntreprise.getEntreprise();
        entrepriseRepository.save(entreprise);
        verificationTokenRepository.delete(verificationTokenEntreprise);
        return "good";
    }

    private void sendConfirmationEmail(Entreprise entrepriseSaved, String url) {
        String token = UUID.randomUUID().toString();
        LocalDateTime dateExpirationToken = LocalDateTime.now().plusDays(1);
        VerificationToken verificationTokenEntreprise = new VerificationToken(token,dateExpirationToken,entrepriseSaved);
        VerificationToken savedToken = verificationTokenRepository.save(verificationTokenEntreprise);
        mailService.sendVerificationEmail(url,savedToken.getToken(),entrepriseSaved.getEmail());
    }
}
