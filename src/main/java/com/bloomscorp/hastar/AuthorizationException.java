package com.bloomscorp.hastar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AuthorizationException extends RuntimeException {

    public static final int AECx01 = 901;
    public static final int AECx02 = 902;
    public static final int AECx03 = 903;
    public static final int AECx04 = 904;
    public static final int AECx05 = 905;
    public static final int AECx06 = 906;

    private static final String GENERIC_EXCEPTION = "An exception occurred while trying to authorize a request.";
    private static final String NO_CREDENTIALS = "Some credentials were missing with the authentication request.";
    private static final String NO_BEARER_IN_HEADER = "The bearer token was not found with the authentication request.";
    private static final String NULL_USERNAME = "The username could not be fetched from the authentication request.";
    private static final String NON_NULL_SECURITY_CONTEXT_AUTHENTICATION = "The authentication in the security context was non-null.";
    private static final String INVALID_JWT_TOKEN = "The JWT token provided was invalid.";

    private final int errorCode;

    public String getMessage() {
        switch (this.errorCode) {
            case AECx01: return NO_CREDENTIALS;
            case AECx02: return NO_BEARER_IN_HEADER;
            case AECx03: return NULL_USERNAME;
            case AECx04: return NON_NULL_SECURITY_CONTEXT_AUTHENTICATION;
            case AECx05: return INVALID_JWT_TOKEN;
            default: return GENERIC_EXCEPTION;
        }
    }
}
