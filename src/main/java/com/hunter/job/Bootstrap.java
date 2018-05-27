package com.hunter.job;

import com.hunter.job.services.InitialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by telly on 27/05/18.
 */
@Component
public class Bootstrap {

    @Autowired
    private InitialisationService initialisationService;

    @PostConstruct
    public void init(){
        try{
            initialisationService.init();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
