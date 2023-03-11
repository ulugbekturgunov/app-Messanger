package org.example.service.user;

import org.example.dto.requestDto.Channel_Group_UserRequestDto;
import org.example.dto.responseDto.Channel_Group_UserResponseDto;
import org.example.model.user.Channel_Group_User_Entity;

import java.util.List;
import java.util.UUID;

public class Channel_Group_UserServiceImp implements Channel_Group_UserService{
    @Override
    public boolean create(Channel_Group_UserRequestDto channel_group_userRequestDto) {
        return false;
    }

    @Override
    public Channel_Group_UserResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<Channel_Group_UserResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, Channel_Group_UserRequestDto channel_group_userRequestDto) {
        return false;
    }

    @Override
    public boolean writeData(List<Channel_Group_User_Entity> data) {
        return false;
    }

    @Override
    public List<Channel_Group_User_Entity> getData() {
        return null;
    }

    @Override
    public Channel_Group_User_Entity getEntity(UUID id) {
        return null;
    }


}
