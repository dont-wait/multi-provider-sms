package com.dontwait.multi_provider_sms.dto.request;

import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class CreateUserRequest {

    String username;

    String password;
    
    String confirmPassword;

    String phone;
}
