package org.example.service.chat;

import org.example.dto.requestDto.ChatRequestDto;
import org.example.dto.responseDto.ChatResponseDto;
import org.example.model.chat.ChatEntity;

import java.util.List;
import java.util.UUID;

public class ChatServiceImp implements ChatService{
    @Override
    public boolean create(ChatRequestDto chatRequestDto) {
        return false;
    }

    @Override
    public ChatResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<ChatResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, ChatRequestDto chatRequestDto) {
        return false;
    }

    @Override
    public List<ChatEntity> getData() {
        return null;
    }

    @Override
    public boolean writeData(List<ChatEntity> data) {
        return false;
    }

    @Override
    public ChatEntity getEntity(UUID id) {
        return null;
    }
}
