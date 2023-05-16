package com.italent.advice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.italent.execption.UserNotFoundException;

@RestControllerAdvice
public class AdviceApplication {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> inValid(MethodArgumentNotValidException ex){
		
		
		Map<String,String> errorMap=new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().
		forEach(error -> {
            errorMap.put(error.getField(), error.getDefaultMessage());
        }
		);
		return errorMap;
		}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserNotFoundException.class)
	public Map<String,String> handleBusinessException(UserNotFoundException ex){
		
		Map<String,String> errorMap=new HashMap<>();
		
		errorMap.put("error message", ex.getMessage());
		
		return errorMap;
		
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NoSuchElementException.class)
	public Map<String,String> NotVaild(NoSuchElementException ex){
		
		Map<String,String> erroeMap=new HashMap<String,String>();
		
		erroeMap.put("Error message", "no data present with this id");
		return erroeMap;
}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	

