package test;

import java.util.List;

	//Get the names of all employees who have joined after 2015?

public class NamesOfEmployee {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.employees();
		
		employeeList.stream().filter(e->e.getYearOfJoining()>2015).
		forEach(e->System.out.println(e.getName()));
	}

}
