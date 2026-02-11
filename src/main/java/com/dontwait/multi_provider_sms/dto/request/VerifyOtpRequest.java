package com.dontwait.multi_provider_sms.dto.request;

import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class VerifyOtpRequest {
   String phone;
   String otp; 
}
