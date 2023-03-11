package org.example.dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Builder
public class Message_StateRequestDto {
    private UUID messageId;
    private UUID userId;
    private UUID groupId;
    private String messageStatus;
}
