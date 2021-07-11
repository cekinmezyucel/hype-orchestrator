/*
package com.productstock.hype.kafka;

import com.productstock.hype.model.ProductEventRequest;
import java.util.HashMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaProducerConfig {

  @Bean
  public ProducerFactory<String, ProductEventRequest> greetingProducerFactory() {
    return new DefaultKafkaProducerFactory<>(new HashMap<>());
  }

  @Bean
  public KafkaTemplate<String, ProductEventRequest> greetingKafkaTemplate() {
    return new KafkaTemplate<>(greetingProducerFactory());
  }

}
*/
