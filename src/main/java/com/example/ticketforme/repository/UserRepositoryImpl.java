package com.example.ticketforme.repository;

import com.example.ticketforme.domain.user.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class UserRepositoryImpl implements CustomUserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findByUserId(String userId) {
        return entityManager.find(User.class, userId);
    }
}
