package com.bloomscorp.hastar.code;

import com.bloomscorp.hastar.support.Constant;
import com.bloomscorp.hastar.support.Message;

public final class ActionCode {

    private ActionCode() {}

    public static final int NO_ACTION = 0;
    public static final int INSERT_SUCCESS = 1;
    public static final int UPDATE_SUCCESS = 2;
    public static final int DELETE_SUCCESS = 3;
    public static final int INSERT_FAILURE = -1;
    public static final int NOT_UNIQUE = -2;
    public static final int INCORRECT_INFORMATION = -3;
    public static final int UNAUTHORIZED_ACCESS = -4;
    public static final int UPDATE_FAILURE = -5;
    public static final int PARTIAL_UPDATE_FAILURE = -6;
    public static final int DELETE_FAILURE = -7;

    public static String message(int code) {
        return switch (code) {
            case INSERT_SUCCESS -> Message.INSERT_SUCCESS;
            case UPDATE_SUCCESS -> Message.UPDATE_SUCCESS;
            case INSERT_FAILURE -> Message.INSERT_FAILURE;
            case NOT_UNIQUE -> Message.NOT_UNIQUE;
            case INCORRECT_INFORMATION -> Message.INCORRECT_INFORMATION;
            case UNAUTHORIZED_ACCESS -> Message.AUTHORIZATION_DENIED;
            case UPDATE_FAILURE -> Message.UPDATE_FAILURE;
            case PARTIAL_UPDATE_FAILURE -> Message.PARTIAL_UPDATE_FAILURE;
            case DELETE_SUCCESS -> Message.DELETE_SUCCESS;
            case DELETE_FAILURE -> Message.DELETE_FAILURE;
            default -> Constant.BLANK_STRING_VALUE;
        };
    }
}
