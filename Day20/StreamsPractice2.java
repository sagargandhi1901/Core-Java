package Day20;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice2 {
	public static void main(String[] args) {
		
		List<Employee> employees = Stream.of(
					new Employee(156, "Sagar", "Dev", 70000),
					new Employee(192, "Diksha", "QA", 45000), 
					new Employee(209, "Sparsh", "QA", 35000),
					new Employee(109, "Devansh", "Dev", 45000), 
					new Employee(225, "Rajeev", "Devops", 80000),
					new Employee(225, "Sanjay", "Devops", 75000))
				.collect(Collectors.toList());
		
//		Question 6 : Print employees with highest salary in each account
		
//		Map<String,Optional<Employee>> collect = employees.stream()
//				.collect(
//						Collectors.groupingBy(Employee::getDept, 
//								Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
//		System.out.println(collect);
		
//		Question 7 : Sort employee list based on salary 
		
//		employees.stream().sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary()).forEach(System.out::println);
//		employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

//		Question 8 : Sort employee list based on id and if id is same, then sort on salary 
		
//		employees.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getSalary)).forEach(System.out::println);

//		Question 9 : Find list of employees in QA department having salary above 40,000
		
//		List<Employee> collect = employees.stream()
//									.filter(emp -> emp.getDept().equals("QA") && emp.getSalary() >= 45000)
//									.collect(Collectors.toList());
//		System.out.println(collect);
		
//		Question 10 : Find the employee with highest salary
		
//		Optional<Employee> employee = employees.stream()
//										.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
//		if (employee.isPresent()) {
//			System.out.println(employee);
//		}
		
	}
}