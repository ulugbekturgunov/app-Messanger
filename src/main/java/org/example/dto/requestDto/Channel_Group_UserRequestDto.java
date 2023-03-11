package org.example.dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
@Builder
public class Channel_Group_UserRequestDto {
    private UUID userId;
    private UUID group_channel_id;
    private String group_channel_type;
    private String role;
}
