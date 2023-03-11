package org.example.dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Builder
public class Message_StateResponseDto {
    private UUID id;
    private UUID messageId;
    private UUID userId;
    private UUID groupId;
    private String messageStatus;
}
