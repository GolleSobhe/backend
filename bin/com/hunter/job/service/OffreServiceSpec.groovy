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


}
