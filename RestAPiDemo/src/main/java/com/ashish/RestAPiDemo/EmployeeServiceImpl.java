package com.ashish.RestAPiDemo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl {
  
   public List<Employee> createEmployee(){ 
	   List<Employee> employees = new ArrayList<Employee>();
	   
	   Employee e1 = new Employee();
	   e1.setId(100);
	   e1.setName("ashish");
	   e1.setEmail("ashish@gmail.com");
   	   employees.add(e1);
	   return employees;
   }
   
   public Employee getEmployee(int id){ 
	   List<Employee> employees = createEmployee();
	   for(Employee employee : employees)
	   {
		   if(employee.getId() == id){
			  return employee;
		   }
	   }
	   return null;
   }
   
}
