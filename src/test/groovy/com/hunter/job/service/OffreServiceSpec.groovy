package com.hunter.job.service

import com.hunter.job.repositories.OffreRepository
import com.hunter.job.services.OffreService
import org.springframework.data.repository.PagingAndSortingRepository
import spock.lang.Specification

/**
 * Created by telly on 27/05/18.
 */
class OffreServiceSpec extends Specification{

    OffreService offreService
    OffreRepository offreRepository

    def setup(){
        offreRepository = Mock()
        offreService = new OffreService()
        offreService.offreRepository = offreRepository
    }

    def "test type offreRepository"(){
        expect: "OffreRepository est de type Paging ang Sorting Repository"
        offreRepository instanceof PagingAndSortingRepository
    }

    def "test delegation de la recherche au repository"(){
        when: "on recherche toutes les offres"
        offreService.findOffres(null,null,null,1)

        then: "la recherche est deleguee au repository"
        1 * offreRepository.findAll(_)
    }
}
