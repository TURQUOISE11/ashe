package com.amumu.ashe.common.exception;

public class AsheException extends Exception {
    private static final long serialVersionUID = -7370331410579650067L;

    public AsheException(String message) {
        super(message);
    }

    public int getStatusCode() {
        return 500;
    }
}
