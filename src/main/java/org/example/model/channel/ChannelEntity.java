package org.example.model.channel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.BaseModel;
import org.example.model.message.MessageEntity;
import org.example.model.user.Channel_Group_User_Entity;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChannelEntity extends BaseModel {
    private String name;
    private String link;
    private String bio;
    private List<Channel_Group_User_Entity> users;
    private List<MessageEntity> posts;
}
