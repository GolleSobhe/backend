package com.hunter.job.domain

import spock.lang.Specification

import javax.validation.Validation
import javax.validation.Validator
import javax.validation.ValidatorFactory

/**
 * Created by telly on 20/05/18.
 */
class OffreSpec extends Specification{

    Validator validator

    def setup(){
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory()
        validator = validatorFactory.getValidator()
    }

    def "test validite offre"(String pays,String ville,String titre){
        given: "une offre valid"
        Offre offre = new Offre(pays: pays,ville: ville,titre: titre)

        expect: "l'offre est valide"
        validator.validate(offre).empty

        where:
        pays        |ville      |titre
        "guinée"    |"conakry"  | "ingenieur"
        "guinée"    |"labé"     | "chauffeur"
        "guinée"    |"kankan"   | "comptable"
    }

    def "test invalidite offre"(String pays,String ville,String titre){
        given: "une offre non valide"
        Offre offre = new Offre(pays: pays,ville: ville,titre: titre)

        expect: "l'offre est non valide"
        !validator.validate(offre).empty

        where:
        pays        |ville      |titre
        null        |"conakry"  | "ingenieur"
        "guinée"    |null       | "chauffeur"
        "guinée"    |"kankan"   | null
    }
}
