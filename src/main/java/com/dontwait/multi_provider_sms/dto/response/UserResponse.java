package com.dontwait.multi_provider_sms.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    String userId;

    String username;

    String phone;
}
