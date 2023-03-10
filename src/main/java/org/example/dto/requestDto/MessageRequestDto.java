package org.example.dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Builder
public class MessageRequestDto {
    private String text;
    private UUID userId;
    private List<UUID> views;
    private List<String> comments;
}
