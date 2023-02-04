package com.minal.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler
{
    @ExceptionHandler(PatientIdNotFoundException.class)
    public ResponseEntity<ErrorResponse> PatientIdNotFoundException(PatientIdNotFoundException ex)
    {
        ErrorResponse errorResponse=new ErrorResponse();
        errorResponse.setErrorCode(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(ex.getMessage());
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }
}
