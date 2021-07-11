package com.productstock.hype.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse implements Serializable {

  @JsonProperty("IN_STOCK")
  private Integer stockCount;

  @JsonProperty("RESERVED")
  private Integer reservationCount;

  @JsonProperty("SOLD")
  private Integer saleCount;

}
