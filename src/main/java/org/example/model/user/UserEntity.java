package org.example.model.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.enums.Role;
import org.example.model.BaseModel;
@Getter
@Setter
@Builder
public class UserEntity extends BaseModel {
    private String firstName;
    private String lastName;
    private String password;
    private String bio;
    private String phoneNumber;
    private Role role;
}
