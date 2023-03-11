package org.example.model.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.BaseModel;
import org.example.model.message.MessageEntity;
import org.example.model.user.Channel_Group_User_Entity;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GroupEntity extends BaseModel {
    private String name;
    private List<Channel_Group_User_Entity> users;
    private List<MessageEntity> messages;
}
