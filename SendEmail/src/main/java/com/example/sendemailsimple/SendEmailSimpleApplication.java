package com.example.sendemailsimple;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendEmailSimpleApplication {
    @Autowired
    private EmailSenderService service;

    public static void main(String[] args) {
        SpringApplication.run(SendEmailSimpleApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public  void triggerMail() throws MessagingException {

        service.sendEmailWithAttachement("wasselaguech@gmail.com",
                "hello from spring boot email sende service ",
                "mail subject from sprig boot mail sender subject ",
                 "C:\\Users\\hp\\OneDrive\\Bureau\\Nouveau dossier\\attachment_file.txt");

    }




}
