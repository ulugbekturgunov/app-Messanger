package org.example.service.message;

import org.example.dto.requestDto.MessageRequestDto;
import org.example.dto.responseDto.MessageResponse;
import org.example.model.message.MessageEntity;

import java.util.List;
import java.util.UUID;

public class MessageServiceImp implements MessageService {
    @Override
    public boolean create(MessageRequestDto messageRequestDto) {
        return false;
    }

    @Override
    public MessageResponse get(UUID id) {
        return null;
    }

    @Override
    public List<MessageResponse> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, MessageRequestDto messageRequestDto) {
        return false;
    }

    @Override
    public List<MessageEntity> getData() {
        return null;
    }

    @Override
    public boolean writeData(List<MessageEntity> data) {
        return false;
    }

    @Override
    public MessageEntity getEntity(UUID id) {
        return null;
    }
}
