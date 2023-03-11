package org.example.service.comment;

import org.example.dto.requestDto.CommentRequestDto;
import org.example.dto.responseDto.CommentResponseDto;
import org.example.model.comment.CommentEntity;

import java.util.List;
import java.util.UUID;

public class CommentServiceImp implements CommentService{
    @Override
    public boolean create(CommentRequestDto commentRequestDto) {
        return false;
    }

    @Override
    public CommentResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<CommentResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, CommentRequestDto commentRequestDto) {
        return false;
    }

    @Override
    public List<CommentEntity> getData() {
        return null;
    }

    @Override
    public boolean writeData(List<CommentEntity> data) {
        return false;
    }

    @Override
    public CommentEntity getEntity(UUID id) {
        return null;
    }
}
