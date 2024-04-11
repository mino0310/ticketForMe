package com.example.ticketforme.service;

import com.example.ticketforme.domain.user.User;
import com.example.ticketforme.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    // Repository를 Mock으로 선언한다. (데이터 접근 계층 Mock)
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    @Test
    @DisplayName("회원을 user_id로 조회한다.")
    void test() {

        User user = User
                .builder()
                .id(5L)
                .userId("test1")
                .name("testName")
                .address("testAddr")
                .phoneNumber("testPN")
                .build();

        Mockito.when(userRepository.findByUserId("mino")).thenReturn(user);

        User foundUser = userService.getUserByUserId("mino");
        Assertions.assertThat(foundUser).isEqualTo(user);
    }
}