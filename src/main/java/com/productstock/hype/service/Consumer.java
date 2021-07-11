package com.productstock.hype.service;

import static org.springframework.kafka.support.KafkaHeaders.RECEIVED_MESSAGE_KEY;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

  private final Logger logger = LoggerFactory.getLogger(Consumer.class);

  @KafkaListener(topics = "hype", groupId = "group_id")
  public void consume(@Payload String foo, @Header(RECEIVED_MESSAGE_KEY) String key) {
    logger.info(String.format("#### -> Consumed message -> %s", foo));
    logger.info(String.format("#### -> Consumed key -> %s", key));
  }

}
