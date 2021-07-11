package com.productstock.hype.exception.model;

import com.productstock.hype.exception.base.BaseException;

public class BusinessException extends BaseException {

  public BusinessException(String code, Object... parameters) {
    super(code, parameters);
  }
}
