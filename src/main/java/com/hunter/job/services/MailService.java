package com.hunter.job.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendVerificationEmail(String token ,String email){
        System.out.println("sending "+token + " to "+email);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("Confirmation Inscription");
        message.setTo(email);
        String urlVerification = "http://localhost:8080/user/verification/"+token;
        message.setText(urlVerification);
        //mailSender.send(message);
    }

}
