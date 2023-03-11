package org.example.dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Builder
public class MessageResponse {
    private UUID id;
    private String text;
    private UUID userId;
    private List<UUID> views;
    private List<String> comments;
}
