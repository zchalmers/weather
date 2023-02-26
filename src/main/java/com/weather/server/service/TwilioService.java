package com.weather.server.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.nio.file.Path;


public class TwilioService {

        public static void sendSms(String message){
            String accountSid = "ACd2158a44d0074c76fdf0c8cb7bc72d63";
            String authToken = "eb900e8af34318f3965030ef898e2335";
            String file = "C:/Users/zchal/CODING/gs-spring-boot/complete/src/main/java/com/example/springboot/service/pictures/modSunnyDay.JPG";
            Twilio.init(accountSid, authToken);
                Message.creator(
                        new PhoneNumber("+19254874020"),
                        new PhoneNumber("+16193892742"),
                        message)
                        .setMediaUrl(Path.of(file).toUri()
                ).create();
        }


}
