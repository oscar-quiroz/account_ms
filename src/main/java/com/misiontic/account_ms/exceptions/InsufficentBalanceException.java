package com.misiontic.account_ms.exceptions;

public class InsufficentBalanceException extends RuntimeException{
    public InsufficentBalanceException(String message) {
        super(message);
    }
}
