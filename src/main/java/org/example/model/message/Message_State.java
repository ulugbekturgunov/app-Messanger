package org.example.model.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.Message_Status;
import org.example.model.BaseModel;

import java.util.UUID;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Message_State extends BaseModel {
    private UUID messageId;
    private UUID userId;
    private UUID groupId;
    private Message_Status messageStatus;
}
