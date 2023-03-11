package org.example.service.user;

import org.example.dto.requestDto.Channel_Group_UserRequestDto;
import org.example.dto.responseDto.Channel_Group_UserResponseDto;
import org.example.model.user.Channel_Group_User_Entity;
import org.example.service.BaseService;

import java.util.UUID;

public interface Channel_Group_UserService extends
        BaseService<Channel_Group_UserRequestDto, UUID,
                Channel_Group_UserResponseDto, Channel_Group_User_Entity> {
}
