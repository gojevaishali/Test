//Write a program and check whether employee existing or not by passing 
//employee name using JUNIT?

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class EmployeeExistingOrNot {

	public boolean exist(String name) {
		boolean value=false;
		
		List<Employee> employeeList = EmployeeList.employees();
		
		List<String> list = employeeList.stream().map(e->e.getName()).
				collect(Collectors.toList());
		
		for (String string : list) {
			if(string.equalsIgnoreCase(name))
				value=true;
		}
		return value;
	}
	
	@Test
	public void check() {
		boolean value=exist("AKhila");
		assertEquals(true, value);
	}
}
