package org.example.dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Builder
public class UserResponseDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String password;
    private String bio;
    private String phoneNumber;
    private String role;
}
