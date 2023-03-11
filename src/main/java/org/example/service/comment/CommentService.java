package org.example.service.comment;

import org.example.dto.requestDto.CommentRequestDto;
import org.example.dto.responseDto.CommentResponseDto;
import org.example.model.comment.CommentEntity;
import org.example.service.BaseService;

import java.util.UUID;

public interface CommentService extends
        BaseService<CommentRequestDto, UUID, CommentResponseDto, CommentEntity> {
}
