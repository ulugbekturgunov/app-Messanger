package org.example.dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Builder
public class ChatRequestDto {
    private UUID user1;
    private UUID user2;
    /*MessageEntityId-->*/private List<UUID> messages;
}
