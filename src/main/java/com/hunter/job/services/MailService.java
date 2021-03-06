package com.hunter.job.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendVerificationEmail(String url,String token ,String email){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("Confirmer votre inscription sur GolleSobhe");
        message.setTo(email);
        String urlVerification = url+token;
        message.setText(urlVerification);
        mailSender.send(message);
    }

}
