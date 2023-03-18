package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.dto.MessageDTO;

@Component
public class MessageConsumer {
	@KafkaListener(topics = "thread-topic", groupId = "test-group")
	public void listener(MessageDTO messageDTO) {
	    System.out.println("Received Message in group thread-topic: " + messageDTO.getId() + messageDTO.getName());
	}
}

