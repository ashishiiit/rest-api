package com.ashish.RestAPiDemo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.ashish.RestAPiDemo.exception.DataNotFoundException;

@Path("myresource")
public class MyResource {

	EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getIt(@PathParam("id") int id) {

		Employee mm = employeeServiceImpl.getEmployee(id);
		if (mm == null) {
			throw new DataNotFoundException("Employee with id " + id + " not found");
		}
		return mm;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee saveEmployee(Employee e) {
		return e;
	}

}
