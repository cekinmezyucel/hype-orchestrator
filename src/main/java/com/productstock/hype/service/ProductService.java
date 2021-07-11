package com.productstock.hype.service;

import static com.productstock.hype.exception.ExceptionMap.OBJECT_NOT_FOUND;

import com.productstock.hype.controller.response.ProductResponse;
import com.productstock.hype.controller.response.ReservationResponse;
import com.productstock.hype.exception.model.BusinessException;
import com.productstock.hype.kafka.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private final Logger log = LoggerFactory.getLogger(this.getClass());

  private final KafkaProducerService kafkaProducerService;

  public ProductService(KafkaProducerService kafkaProducerService) {
    this.kafkaProducerService = kafkaProducerService;
  }

  public ProductResponse stockUpdate(String productId, Integer stockCount) {
    return new ProductResponse();
  }

  public ProductResponse getProduct(String productId) {
    kafkaProducerService.sendMessage(productId, "test");
    throw new BusinessException(OBJECT_NOT_FOUND, productId);
  }

  public ReservationResponse reserve(String productId) {
    return new ReservationResponse();
  }

  public void unReserve(String productId, String reservationToken) {
    kafkaProducerService.sendMessage(productId, reservationToken);
  }

  public void sold(String productId, String reservationToken) {
  }

}
