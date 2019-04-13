package com.hunter.job.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class VerificationTokenEntreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String token;
    private LocalDateTime dateExpiration;
    @OneToOne
    private Entreprise entreprise;

    public VerificationTokenEntreprise(String token, LocalDateTime dateExpiration, Entreprise entreprise){
        this.token = token;
        this.dateExpiration = dateExpiration;
        this.entreprise = entreprise;
    }
}
