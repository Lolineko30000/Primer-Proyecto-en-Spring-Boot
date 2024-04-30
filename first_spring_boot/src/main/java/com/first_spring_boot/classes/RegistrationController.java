package com.first_spring_boot.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class RegistrationController {

    @Autowired
    private JavaMailSender emailSender;

    @PostMapping("/send-confirmation-email")
    public void sendConfirmationEmail(@RequestBody String email) throws IOException, MessagingException {
        try {
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, StandardCharsets.UTF_8.name());
            helper.setTo(email);
            helper.setSubject("Welcome to Retro Arcade! Confirm your email address");

            String htmlContent = getHtmlContent();
            helper.setText(htmlContent, true);

            emailSender.send(message);
        } catch (Exception ex) {
            // Handle exception
            ex.printStackTrace();
        }
    }

    private String getHtmlContent() throws IOException {
        ClassPathResource resource = new ClassPathResource("confirmation_email.html");
        byte[] htmlBytes = resource.getInputStream().readAllBytes();
        return new String(htmlBytes, StandardCharsets.UTF_8);
    }
}
