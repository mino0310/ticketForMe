package com.example.ticketforme.repository;

import com.example.ticketforme.domain.user.User;

public interface CustomUserRepository {

    User findByUserId(String userId);

}
