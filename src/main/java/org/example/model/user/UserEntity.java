package org.example.model.user;

import org.example.enums.Role;
import org.example.model.BaseModel;

public class UserEntity extends BaseModel {
    private String firstName;
    private String lastName;
    private String password;
    private String bio;
    private String phoneNumber;
    private Role role;
}
