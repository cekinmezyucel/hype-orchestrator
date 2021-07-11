package com.productstock.hype.controller;

import com.productstock.hype.controller.request.StockUpdateRequest;
import com.productstock.hype.controller.request.UnReservationRequest;
import com.productstock.hype.controller.response.ProductResponse;
import com.productstock.hype.controller.response.ReservationResponse;
import com.productstock.hype.service.ProductService;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @PatchMapping("/{id}/stock")
  public ProductResponse stockUpdate(@PathVariable("id") String productId, @Valid @RequestBody StockUpdateRequest stockUpdateRequest) {
    return productService.stockUpdate(productId, stockUpdateRequest.getStockCount());
  }

  @GetMapping("/{id}")
  public ProductResponse getProduct(@PathVariable("id") String productId) {
    return productService.getProduct(productId);
  }

  @PostMapping("/{id}/reserve")
  public ReservationResponse reserve(@PathVariable("id") String productId) {
    return productService.reserve(productId);
  }

  @PostMapping("/{id}/unreserve")
  public void unReserve(@PathVariable("id") String productId, @Valid @RequestBody UnReservationRequest unReservationRequest) {
    productService.unReserve(productId, unReservationRequest.getReservationToken());
  }

  @PostMapping("/{id}/sold")
  public void sold(@PathVariable("id") String productId, @Valid @RequestBody UnReservationRequest unReservationRequest) {
    productService.sold(productId, unReservationRequest.getReservationToken());
  }

}
