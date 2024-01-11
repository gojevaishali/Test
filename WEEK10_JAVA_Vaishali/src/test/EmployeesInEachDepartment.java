package test;
		
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

			//List down the names of all employees in each department?

public class EmployeesInEachDepartment {

	public static void main(String[] args) {
	
		List<Employee> employeeList = EmployeeList.employees();
		
		Map<String, List<Employee>> map = employeeList.stream().
				collect(Collectors.groupingBy(Employee::getDepartment));
		
		Set<Entry<String, List<Employee>>> set = map.entrySet();
		
		for (Entry<String, List<Employee>> entry : set) {
			System.out.println(entry.getKey()+":-");
			List<Employee> empList = entry.getValue();
			for (Employee list : empList) {
				System.out.println(list.getName());
			}
		}
	}

}
