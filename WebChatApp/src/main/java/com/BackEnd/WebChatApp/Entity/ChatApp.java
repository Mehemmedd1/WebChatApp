package com.BackEnd.WebChatApp.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
@Getter
@Setter
@ToString
public class ChatApp {
    @Id
    private Long d;

    private String sender;
    private String message;
}
