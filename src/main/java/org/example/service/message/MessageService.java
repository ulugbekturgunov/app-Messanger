package org.example.service.message;

import org.example.dto.requestDto.MessageRequestDto;
import org.example.dto.responseDto.MessageResponse;
import org.example.model.message.MessageEntity;
import org.example.service.BaseService;

import java.util.UUID;

public interface MessageService extends
        BaseService<MessageRequestDto, UUID, MessageResponse, MessageEntity> {

}
