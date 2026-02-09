package com.dontwait.multi_provider_sms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dontwait.multi_provider_sms.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    Optional<User> findByUsername(String username);
    Boolean existsByPhone(String phone);
    Boolean existsByUsername(String username);
}
