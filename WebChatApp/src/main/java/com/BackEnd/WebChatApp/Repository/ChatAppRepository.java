package com.BackEnd.WebChatApp.Repository;

import com.BackEnd.WebChatApp.Entity.ChatApp;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatAppRepository extends MongoRepository<ChatApp,Long> {
}
