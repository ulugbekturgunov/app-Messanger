package org.example.model.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.BaseModel;
import org.example.model.comment.CommentEntity;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessageEntity extends BaseModel {
    private String text;
    private UUID userId;
    private Date date = new Date();
    private List<UUID> views;
    private List<CommentEntity> comments;
}
