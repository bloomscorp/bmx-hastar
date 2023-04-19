package com.bloomscorp.hastar;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CarrierException extends RuntimeException {
    private final Exception origin;
    private final int errorCode;
}
