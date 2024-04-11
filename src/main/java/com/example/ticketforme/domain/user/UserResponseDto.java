package com.example.ticketforme.domain.user;


import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder
@Getter
public class UserResponseDto implements Serializable {

    public String userId;

    public String name;

    public String address;

    public String phoneNumber;

    public static UserResponseDto fromUser(User user) {
        return UserResponseDto.builder()
                .userId(user.userId)
                .name(user.name)
                .address(user.address)
                .phoneNumber(user.phoneNumber)
                .build();
    }
}
