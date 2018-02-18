package com.hunter.job.controller;

import com.hunter.job.domain.Candidat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by telly on 28/01/18.
 */
@RestController
@RequestMapping("/candidat")
public class CandidatController extends ControleurGenerique<Candidat> {

}
