package org.example.service.group;

import org.example.dto.requestDto.GroupRequestDto;
import org.example.dto.responseDto.GroupResponseDto;
import org.example.model.group.GroupEntity;

import java.util.List;
import java.util.UUID;

public class GroupServiceImp implements GroupService{
    @Override
    public boolean create(GroupRequestDto groupRequestDto) {
        return false;
    }

    @Override
    public GroupResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<GroupResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, GroupRequestDto groupRequestDto) {
        return false;
    }

    @Override
    public List<GroupEntity> getData() {
        return null;
    }

    @Override
    public boolean writeData(List<GroupEntity> data) {
        return false;
    }

    @Override
    public GroupEntity getEntity(UUID id) {
        return null;
    }
}
