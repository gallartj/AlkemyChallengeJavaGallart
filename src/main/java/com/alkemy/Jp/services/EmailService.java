package com.alkemy.Jp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender sender;

    @Value("${spring.mail.username}")
    private String from;

    public void enviarCorreo(String to, String asunto, String cuerpo) {

        new Thread(() -> {
            try {
                System.out.println("Enviando correo a " + to);
                MimeMessage message = sender.createMimeMessage();
                MimeMessageHelper helper = new MimeMessageHelper(message);
                helper.setFrom(from);
                helper.setTo(to);
                helper.setSubject(asunto);
                helper.setText(cuerpo);
                sender.send(message);
            } catch (MessagingException e) {
                System.out.println("Error al enviar el correo a " + to);
            }

        }).start();

    }
}
