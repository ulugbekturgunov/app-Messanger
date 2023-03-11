package org.example.dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Builder
public class GroupResponseDto {
    private UUID id;
    private String name;
    private List<UUID> users;
    /*MessageEntityID-->*/private List<UUID> messages;
}
