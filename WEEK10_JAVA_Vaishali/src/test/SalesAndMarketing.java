package test;

import java.util.List;
import java.util.stream.Collectors;

//Number of male and female employees are there in the sales and marketing department?

public class SalesAndMarketing {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.employees();
		
		employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("sales")||
				e.getDepartment().equalsIgnoreCase("marketing")).
		collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).
		entrySet().forEach(System.out::println);
	}

}
