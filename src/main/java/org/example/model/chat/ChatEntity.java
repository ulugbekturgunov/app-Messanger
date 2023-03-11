package org.example.model.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.BaseModel;
import org.example.model.message.MessageEntity;
import org.example.model.user.UserEntity;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatEntity extends BaseModel {
    private UserEntity user1;
    private UserEntity user2;
    private List<MessageEntity> messages;
}
