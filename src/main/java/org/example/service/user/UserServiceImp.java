package org.example.service.user;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.dto.requestDto.UserRequestDto;
import org.example.dto.responseDto.UserResponseDto;
import org.example.enums.Role;
import org.example.model.user.UserEntity;
import org.modelmapper.ModelMapper;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserServiceImp implements UserService {
    static ModelMapper modelMapper = new ModelMapper();

    @Override
    public UserResponseDto getPhoneNumber(String phoneNumber) {
        for (UserEntity user : getData()) {
            if (user.getPhoneNumber().equals(phoneNumber)) {
                return modelMapper.map(user, UserResponseDto.class);
            }
        }
        return null;
    }

    @Override
    public boolean create(UserRequestDto userRequestDto) {
        if (userRequestDto != null){
            Role role = Role.getRole(userRequestDto.getRole());
            if (role != null) {
                if (getPhoneNumber(userRequestDto.getPhoneNumber()) == null
                && userRequestDto.getPassword() != null
                && userRequestDto.getFirstName() != null) {
                    List<UserEntity> data = getData();
                    if (data == null) {
                        data = new ArrayList<>();
                    }
                    UserEntity user =
                            modelMapper.map(userRequestDto, UserEntity.class);
                    user.setRole(role);
                    data.add(user);
                    writeData(data);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public UserResponseDto get(UUID id) {
        return null;
    }

    @Override
    public List<UserResponseDto> getList() {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, UserRequestDto userRequestDto) {
        return false;
    }

    @Override
    public List<UserEntity> getData() {
        File file = new File("data/users.json");
        Gson gson = new Gson();
        List<UserEntity> users;
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(file))){
            Type type = new TypeToken<List<UserEntity>>() {}.getType();
            users = gson.fromJson(bufferedReader,type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public boolean writeData(List<UserEntity> data) {
        File file = new File("data/users.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(file))){
            String json = gson.toJson(data);
            bufferedWriter.write(json);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    @Override
    public UserEntity getEntity(UUID id) {
        return null;
    }
}
