package com.hunter.job.repository

import com.hunter.job.domain.Entreprise
import com.hunter.job.domain.Offre
import com.hunter.job.repositories.EntrepriseRepository
import com.hunter.job.repositories.OffreRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import javax.transaction.Transactional

/**
 * Created by telly on 20/05/18.
 */
@SpringBootTest
@Transactional
class OffreRepositoryISpec extends Specification{

    @Autowired
    OffreRepository offreRepository
    @Autowired
    EntrepriseRepository entrepriseRepository

    def "test creation offre"(){
        given: "une entreprise sauvegardee"
        Entreprise entreprise = new Entreprise("entreprise")
        entrepriseRepository.save(entreprise)
        and: "une offre valide"
        Offre offre = new Offre("guinee","conakry","ingenieur","descr",entreprise)

        when: "on enregistre l'offre"
        Offre savedOffre = offreRepository.save(offre)

        then: "l'offre enregistree a un id"
        savedOffre.id != null

        and: "l'offre sauvegardee est la meme que l'offred'origine"
        offre == savedOffre

        when: "quand on recheche l'offre"
        Offre fetched = offreRepository.findOne(savedOffre.id)

        then: "l'offre existe"
        fetched != null

        and: "l'offre touvee contient les bonnes informations"
        fetched.pays == "guinee"
        fetched.ville == "conakry"
        fetched.titre == "ingenieur"

    }
}
