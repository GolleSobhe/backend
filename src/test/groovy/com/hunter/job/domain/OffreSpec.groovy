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

    def "test validite offre"(String pays,String ville,String titre,String description,Entreprise entreprise){
        given: "une offre valid"
        Offre offre = new Offre(pays,ville,titre,description,entreprise)

        expect: "l'offre est valide"
        validator.validate(offre).empty

        where:
        pays        |ville      |titre          |description    |entreprise
        "guinée"    |"conakry"  | "ingenieur"   |"coder"        |new Entreprise("cbg")
        "guinée"    |"labé"     | "chauffeur"   |"conduire"     |new Entreprise("cbg")
        "guinée"    |"kankan"   | "comptable"   |"argent"       |new Entreprise("cbg")
    }

    def "test invalidite offre"(String pays,String ville,String titre,String description,Entreprise entreprise){
        given: "une offre non valide"
        Offre offre = new Offre(pays,ville,titre,description,entreprise)

        expect: "l'offre est non valide"
        !validator.validate(offre).empty

        where:
        pays        |ville      |titre          |description    |entreprise
        null        |"conakry"  | "ingenieur"   |"dess"         |new Entreprise("cbg")
        "guinée"    |null       | "chauffeur"   |"njlj"         |new Entreprise("cbg")
        "guinée"    |"kankan"   | null          |"mkm"          |new Entreprise("cbg")
        "guinée"    |"kankan"   | "sdsds"       |null           |new Entreprise("cbg")
    }
}
