package org.example.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.Channel_Group;
import org.example.model.BaseModel;

import javax.management.relation.Role;
import java.util.UUID;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Channel_Group_User_Entity extends BaseModel {
    private UUID userId;
    private UUID group_channel_id;
    private Channel_Group type;
    private Role role;
}
