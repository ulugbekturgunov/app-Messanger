package org.example.service.user;

import org.example.dto.requestDto.UserRequestDto;
import org.example.dto.responseDto.UserResponseDto;
import org.example.model.user.UserEntity;
import org.example.service.BaseService;

import java.util.UUID;

public interface UserService
        extends BaseService<UserRequestDto, UUID, UserResponseDto, UserEntity> {
    UserResponseDto getPhoneNumber(String phoneNumber);
}

