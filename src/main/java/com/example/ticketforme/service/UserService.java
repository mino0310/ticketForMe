package com.example.ticketforme.service;

import com.example.ticketforme.repository.UserRepository;
import com.example.ticketforme.repository.UserRepositoryImpl;
import com.example.ticketforme.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUserByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }
}
