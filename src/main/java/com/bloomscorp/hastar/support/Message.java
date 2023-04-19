package com.bloomscorp.hastar.support;

public final class Message {

    private Message() {}

    public static final String IO_FAILURE = "An I/O failure was encountered.";
    public static final String SERVLET_FAILURE = "A servlet failed while trying to process your request.";
    public static final String EXPIRED_CREDENTIALS = "The credentials used have expired.";
    public static final String ILLEGAL_ARGUMENTS = "Illegal credentials were used to authenticate.";
    public static final String BAD_CREDENTIALS = "The credentials provided were incorrect.";
    public static final String ACCOUNT_DISABLED = "The associated account is disabled and not accessible.";
    public static final String AUTH_INFO_UNAVAILABLE = "No associated account was found. Bad credentials, maybe.";
    public static final String INTERNAL_AUTHENTICATION_SERVICE_FAILURE = "Our system failed to authenticate the credentials.";
    public static final String MALFORMED_CREDENTIALS = "The credentials have been tampered with.";
    public static final String USERNAME_NOT_FOUND = "The username does not have any associated account.";
    public static final String USER_ACCOUNT_LOCKED = "The user account may be locked. Contact systems administrator.";
    public static final String INCOMPLETE_INFORMATION = "Complete information was not provided.";
    public static final String MALFORMED_INFORMATION = "The information provided is malformed and cannot be accepted.";
    public static final String UNHANDLED_EXCEPTION = "The system detected an unknown error.";
    public static final String EXCEPTION_READING_REQUEST = "An exception occurred while trying to read the request dump contents.";
    public static final String GENERIC_ERROR = "An error occurred.";
    public static final String EMAIL_ENCODER_ERROR = "An error occurred while trying to encrypt or decrypt an email address";
    public static final String PASSWORD_ENCODER_ERROR = "An error occurred while trying to encrypt or decrypt a password";
    public static final String AUTHORIZATION_DENIED = "Authorization has been denied.";
    public static final String INVALID_REQUEST = "This request is invalid.";
    public static final String INSERT_SUCCESS = "The request is successfully added to database.";
    public static final String UPDATE_SUCCESS = "The request is successfully updated to database.";
    public static final String DELETE_SUCCESS = "The request is successfully deleted from database.";
    public static final String INSERT_FAILURE = "The request failed to add to database.";
    public static final String NOT_UNIQUE = "The request is not unique.";
    public static final String UPDATE_FAILURE = "The request failed to update the database.";
    public static final String PARTIAL_UPDATE_FAILURE = "Some instances failed to update the database while others were successful.";
    public static final String INCORRECT_INFORMATION = "The request contains incorrect information.";
    public static final String DELETE_FAILURE = "The request failed to delete from database.";
}
