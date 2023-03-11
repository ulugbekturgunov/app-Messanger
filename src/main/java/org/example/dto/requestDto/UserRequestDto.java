package org.example.dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class UserRequestDto {
    private String firstName;
    private String lastName;
    private String password;
    private String bio;
    private String phoneNumber;
    private String role;
}
