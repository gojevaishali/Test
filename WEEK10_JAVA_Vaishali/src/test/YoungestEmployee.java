package test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Get the youngest employee details each department wise?

public class YoungestEmployee {

	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeList.employees();
		
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).
		entrySet().forEach(e->{
			System.out.println(e.getKey()+":-");
			Optional<Employee> emp = e.getValue().stream().min(Comparator.
					comparingInt(Employee::getAge));
			System.out.println(emp.get());
		});
		
	}

}
