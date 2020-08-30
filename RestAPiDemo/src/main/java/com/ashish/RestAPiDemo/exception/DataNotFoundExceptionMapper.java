package com.ashish.RestAPiDemo.exception;

import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
//this class use to map DataNotFoundException to JaxRs exception
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{
	static final int ERROR_CODE = 400;
	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage message= new ErrorMessage(ERROR_CODE, ex.getMessage());
		return Response.status(Status.NOT_FOUND).entity(message).build();
	}
}
