package com.hunter.job.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by telly on 28/01/18.
 */
@Entity
public class Entreprise{

    public Entreprise() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}
