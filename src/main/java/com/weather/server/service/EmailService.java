package com.weather.server.service;


import jakarta.activation.DataHandler;
import jakarta.activation.DataSource;
import jakarta.activation.FileDataSource;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.util.Properties;

public class EmailService {

    public EmailService(){


    }

    public static void sendEmail(String carrier, String phoneNumber) {
        String to = findCarrierNumber(carrier, phoneNumber);

        String from = "textthread22@gmail.com";
        String host = "smtp.gmail.com";
        String password = "vlniflqghlvpxlkq";

        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new jakarta.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from,password);
                    }
                });
        session.setDebug(true);
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setText("Weather Forecast", "UTF-8", "plain");
            message.setHeader("Content-Type", "text/plain; charset=UTF-8");

            BodyPart bodyPart = new MimeBodyPart();
            Multipart multipart = new MimeMultipart();
            String fileName = "C:/Users/zchal/CODING/gs-spring-boot/complete/src/main/java/com/example/springboot/service/pictures/modSunnyDay.JPG";

            DataSource source = new FileDataSource(fileName);
            bodyPart.setDataHandler(new DataHandler(source));
            bodyPart.setFileName(fileName);
            multipart.addBodyPart(bodyPart);
            message.setContent(multipart);
            //send message
            Transport.send(message);
            System.out.println("message sent successfully");
        }
        catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
    public static String findCarrierNumber(String carrier, String phoneNumber){
       if (carrier.toLowerCase().equals("att")) {
           return String.format("%s@mms.att.net", phoneNumber);
       }
       else if (carrier.toLowerCase().equals("verizon")){
           return String.format("%s@vzwpix.com");
       }
       else if (carrier.toLowerCase().equals("tmobile")){
           return String.format("%s@tmomail.net", phoneNumber);
       }
       else if (carrier.toLowerCase().equals("sprint")){
           return String.format("%s@pm.sprint.com", phoneNumber);
       }
       else {
           throw new IllegalArgumentException("Carrier is not supported");
       }
    }
}


