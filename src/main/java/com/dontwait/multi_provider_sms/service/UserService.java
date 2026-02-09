package com.dontwait.multi_provider_sms.service;

import org.springframework.stereotype.Service;

import com.dontwait.multi_provider_sms.dto.request.CreateUserRequest;
import com.dontwait.multi_provider_sms.dto.response.UserResponse;
import com.dontwait.multi_provider_sms.entity.User;
import com.dontwait.multi_provider_sms.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class UserService {
    UserRepository userRepository;

    public UserResponse createUser(CreateUserRequest request) {

        if(!request.getPassword().equals(request.getConfirmPassword())) {
            throw new IllegalArgumentException("Password and Confirm Password do not match");
        }

        if(userRepository.existsByUsername(request.getUsername())) {
            throw new IllegalArgumentException("Username already exists");
        }

        if(userRepository.existsByPhone(request.getPhone())) {
            throw new IllegalArgumentException("Phone number already exists");
        }


        User user = userRepository.save(User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .phone(request.getPhone())
                .build());

        return UserResponse.builder()
                .userId(user.getId())
                .username(user.getUsername())
                .phone(user.getPhone())
                .build();
    }

    public UserResponse getUserByUsername(String username) {
        User existingUser = userRepository.findByUsername(username).orElseThrow(() 
        -> new IllegalArgumentException("User not found"));
        return UserResponse.builder()
                .userId(existingUser.getId())
                .username(existingUser.getUsername())
                .phone(existingUser.getPhone())
                .build();
    }
}
