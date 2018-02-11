package com.hunter.job.controller;

import com.hunter.job.domain.Offre;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/offres")
public class ControleurOffre extends ControleurGenerique<Offre>{
}
