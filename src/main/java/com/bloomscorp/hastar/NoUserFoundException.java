package com.bloomscorp.hastar;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NoUserFoundException extends RuntimeException {
    private final String username;
}
