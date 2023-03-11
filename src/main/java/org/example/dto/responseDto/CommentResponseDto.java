package org.example.dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Builder
public class CommentResponseDto {
    private UUID id;
    private UUID userId;
    private String text;
}
