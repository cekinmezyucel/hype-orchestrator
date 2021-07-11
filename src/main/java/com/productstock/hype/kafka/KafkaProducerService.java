package com.productstock.hype.kafka;

import static com.productstock.hype.util.ApplicationConstants.TOPIC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  public void sendMessage(String productId, String message) {
    this.kafkaTemplate.send(TOPIC, productId, message);
  }

}
