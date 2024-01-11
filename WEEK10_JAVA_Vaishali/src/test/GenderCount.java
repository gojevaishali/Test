package test;

import java.util.List;
import java.util.stream.Collectors;

		//How many male and female employees are there in the organization?

public class GenderCount {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.employees();

		employeeList.stream().collect(Collectors.
				groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);
	}
}
