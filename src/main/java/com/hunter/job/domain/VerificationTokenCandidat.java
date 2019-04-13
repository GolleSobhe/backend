package com.hunter.job.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor
public class VerificationTokenCandidat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String token;
    private LocalDateTime dateExpiration;
    @OneToOne
    private Candidat candidat;

    public VerificationTokenCandidat(String token, LocalDateTime dateExpiration, Candidat candidat){
        this.token = token;
        this.dateExpiration = dateExpiration;
        this.candidat = candidat;
    }

}
