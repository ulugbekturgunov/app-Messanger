package org.example.dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Builder
public class ChatResponseDto {
    private UUID user1;
    private UUID user2;
    private List<UUID> messages;
}
