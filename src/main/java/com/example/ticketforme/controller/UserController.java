package com.example.ticketforme.controller;

import com.example.ticketforme.domain.user.User;
import com.example.ticketforme.domain.user.UserResponseDto;
import com.example.ticketforme.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/{userId}")
    public UserResponseDto getUser(@PathVariable String userId){
        User foundUser = userService.getUserByUserId(userId);
        return UserResponseDto.fromUser(foundUser);
    }


}
