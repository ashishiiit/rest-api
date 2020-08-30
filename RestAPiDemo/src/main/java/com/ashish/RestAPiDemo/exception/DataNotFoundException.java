package com.ashish.RestAPiDemo.exception;

public class DataNotFoundException extends RuntimeException{
 
     public static final long serialVersionUID = 1L;
    
     public DataNotFoundException(String message){
    	 super(message);
     }

}
