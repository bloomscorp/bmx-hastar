package com.bloomscorp.hastar.code;

import com.bloomscorp.hastar.support.Message;

public final class ErrorCode {

    private ErrorCode() {}

    public static final int GENERIC = -1;
    public static final int EMAIL_ENCODER = -2;
    public static final int PASSWORD_ENCODER = -3;
    public static final int MALFORMED_PAYLOAD = -4;
    public static final int FORGED_REQUEST = -5;
    public static final int AUTHORIZATION_DENIED = -6;
    public static final int INVALID_REQUEST = -7;
    public static final int INVALID_INFORMATION = -8;

    public static String decode(int code) {
        switch (code) {
            case EMAIL_ENCODER: return Message.EMAIL_ENCODER_ERROR;
            case PASSWORD_ENCODER: return Message.PASSWORD_ENCODER_ERROR;
            case MALFORMED_PAYLOAD:
            case FORGED_REQUEST: return Message.MALFORMED_INFORMATION;
            case AUTHORIZATION_DENIED: return Message.AUTHORIZATION_DENIED;
            case INVALID_REQUEST: return Message.INVALID_REQUEST;
            case INVALID_INFORMATION: return Message.INCORRECT_INFORMATION;
            default: return Message.GENERIC_ERROR;
        }
    }
}
