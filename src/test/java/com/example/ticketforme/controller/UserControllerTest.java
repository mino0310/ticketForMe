package com.example.ticketforme.controller;

import com.example.ticketforme.domain.user.User;
import com.example.ticketforme.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserService userService;


    @Test
    @DisplayName("/user/mino 요청이 올 경우 200 상태값을 반환한다.")
    void testUserCreateRequestOk() throws Exception {

        // Given: 유저 정보가 주어진다.
        User user = User.builder()
                .id(5L)
                .address("test1")
                .name("test")
                .userId("mino")
                .build();

        Mockito.when(userService.getUserByUserId("mino")).thenReturn(user);

        // When & Then: 특정 요청이 오면 status code 200을 반환한다.
        mockMvc.perform(MockMvcRequestBuilders.get("/users/mino"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}