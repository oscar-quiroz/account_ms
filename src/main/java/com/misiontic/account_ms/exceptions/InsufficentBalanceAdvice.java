package com.misiontic.account_ms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class InsufficentBalanceAdvice {

    @ResponseBody
    @ExceptionHandler(InsufficentBalanceException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String InsufficientBalanceAdvice(InsufficentBalanceException ex){
        return ex.getMessage();
    }
}
