package com.binu.sample.myrestservice.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class MyGlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(PersonNotFoundException.class)
	public final ResponseEntity<Object> handlePersonNotFoundException(PersonNotFoundException e,WebRequest wb)
	{
		ErrorCommonResponse response=new ErrorCommonResponse(new Date(), e.getMessage(), wb.getDescription(false));
		return new ResponseEntity<Object>(response,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllKindOfExcception(Exception e,WebRequest wb)
	{
		ErrorCommonResponse response=new ErrorCommonResponse(new Date(), e.getMessage(), wb.getDescription(false));
		return new ResponseEntity<Object>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
