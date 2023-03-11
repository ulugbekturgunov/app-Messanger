package org.example.service.user;

import org.example.dto.requestDto.UserRequestDto;
import org.example.dto.responseDto.UserResponseDto;
import org.example.model.user.UserEntity;

import java.util.List;
import java.util.UUID;

public class UserServiceImp implements UserService {
    @Override
    public boolean create(UserRequestDto userRequestDto) {
        return false;
    }

    @Override
    public UserResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<UserResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, UserRequestDto userRequestDto) {
        return false;
    }

    @Override
    public List<UserEntity> getData() {
        return null;
    }

    @Override
    public boolean writeData(List<UserEntity> data) {
        return false;
    }

    @Override
    public UserEntity getEntity(UUID id) {
        return null;
    }
}
