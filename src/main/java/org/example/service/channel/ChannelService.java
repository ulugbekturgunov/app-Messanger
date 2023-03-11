package org.example.service.channel;

import org.example.dto.requestDto.ChannelRequestDto;
import org.example.dto.responseDto.ChannelResponseDto;
import org.example.model.channel.ChannelEntity;
import org.example.service.BaseService;

import java.util.UUID;

public interface ChannelService extends
        BaseService<ChannelRequestDto, UUID, ChannelResponseDto, ChannelEntity> {
}
