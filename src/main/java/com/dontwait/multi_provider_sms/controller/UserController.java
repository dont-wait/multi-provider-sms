package com.dontwait.multi_provider_sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dontwait.multi_provider_sms.dto.request.CreateUserRequest;
import com.dontwait.multi_provider_sms.dto.response.UserResponse;
import com.dontwait.multi_provider_sms.entity.User;
import com.dontwait.multi_provider_sms.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    UserService userService;    


    @PostMapping
    UserResponse createUser(@RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    public UserResponse getMethodName(@RequestParam String name) {
        return userService.getUserByUsername(name);
    }
    
        
}
