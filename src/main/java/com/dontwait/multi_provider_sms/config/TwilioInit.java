package com.dontwait.multi_provider_sms.config;

import java.util.logging.Logger;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInit {

    final static Logger LOGGER = Logger.getLogger(TwilioInit.class.getName());
    final TwilioConfiguration twilioConfiguration;
    public TwilioInit(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
        com.twilio.Twilio.init(
            twilioConfiguration.getAccountSid(),
            twilioConfiguration.getAuthToken()
        );
        LOGGER.info("Twilio initialized with account SID: " + twilioConfiguration.getAccountSid());
    }
}