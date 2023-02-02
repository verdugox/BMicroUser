package com.micro.user.service;
import com.micro.user.events.Event;
import com.micro.user.events.PurseYankieCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class
PurseYankieEventsService {

	@KafkaListener(
			topics = "${topic.purseYankie.name:purseYankies}",
			containerFactory = "kafkaListenerContainerFactory",
	groupId = "grupo1")
	public void consumer(Event<?> event) {
		if (event.getClass().isAssignableFrom(PurseYankieCreatedEvent.class)) {
			PurseYankieCreatedEvent purseYankieCreatedEvent = (PurseYankieCreatedEvent) event;
			log.info("Received PurseYankie created event .... with Id={}, data={}",
					purseYankieCreatedEvent.getId(),
					purseYankieCreatedEvent.getData().toString());
		}

	}

	

}
