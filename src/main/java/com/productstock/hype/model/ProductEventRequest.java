package com.productstock.hype.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class ProductEventRequest implements Serializable {

  private String productId;

  private Action action;

  private String reservationToken;

}
