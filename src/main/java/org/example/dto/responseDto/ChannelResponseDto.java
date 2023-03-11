package org.example.dto.responseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Builder
public class ChannelResponseDto {
    private UUID id;
    private String name;
    private String link;
    private String bio;
    /*Channel_Group_User_Entity-->*/private List<UUID> users;
    /*MessageEntity-->*/private List<UUID> posts;
}
