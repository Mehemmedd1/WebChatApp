package com.BackEnd.WebChatApp.Controller;

import com.BackEnd.WebChatApp.Entity.ChatApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ChatAppController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void chatEndpoint(@Payload ChatApp chatApp) {
        System.out.println(chatApp);
        messagingTemplate.convertAndSend("/topic", chatApp);

    }


}

