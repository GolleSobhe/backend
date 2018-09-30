package com.hunter.job.dto;

import com.hunter.job.domain.TypeOffre;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Created by telly on 16/09/18.
 */
@Getter @Setter @NoArgsConstructor
public class OffreDto {

    @NotNull
    private String titre;

    @NotNull
    private String description;

    @NotNull
    private Long salaireMinimum;

    @NotNull
    private Long salaireMaximum;

    @NotNull
    private TypeOffre type;

    public OffreDto(String titre,String description,Long salaireMinimum,Long salaireMaximum,TypeOffre type){
        this.description = description;
        this.titre = titre;
        this.salaireMaximum =salaireMaximum;
        this.salaireMinimum = salaireMinimum;
        this.type = type;
    }
}
