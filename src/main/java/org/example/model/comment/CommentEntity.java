package org.example.model.comment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.BaseModel;

import java.util.Date;
import java.util.UUID;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentEntity extends BaseModel {
    private UUID userId;
    private String text;
    private Date date = new Date();
}
