package com.dontwait.multi_provider_sms.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Configuration
@ConfigurationProperties(prefix = "twilio")
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
public class TwilioConfiguration {
    String accountSid;
    String authToken;
    String phoneNumber; 
}
