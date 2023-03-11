package org.example.service.group;

import org.example.dto.requestDto.GroupRequestDto;
import org.example.dto.responseDto.GroupResponseDto;
import org.example.model.group.GroupEntity;
import org.example.service.BaseService;

import java.util.UUID;

public interface GroupService
        extends BaseService<GroupRequestDto, UUID, GroupResponseDto, GroupEntity> {
}
