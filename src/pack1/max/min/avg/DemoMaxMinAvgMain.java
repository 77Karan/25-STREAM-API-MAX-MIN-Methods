package pack1.max.min.avg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoMaxMinAvgMain 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Ramu",23, 2000);
		Employee e2 = new Employee("Ashok",25, 3000);
		Employee e3 = new Employee("Suresh",33, 25000);
		
		List<Employee> employess = Arrays.asList(e1,e2,e3);
		System.out.println("=====================AVG SAL========================");

		
		Double avgSal = employess.stream()
		.collect(Collectors.averagingInt(e -> e.getSal()));
		
		System.out.println("Average Salary of the Employees>>"+avgSal);
		
		System.out.println("=====================MAX SAL========================");
		
	 Optional<Employee> maxSal =employess.stream()
	 .collect(Collectors.maxBy(Comparator.comparing(e->e.getSal())));
	 
	 System.out.println("Max sal employee is "+maxSal.get());
	 
		System.out.println("=====================MIN SAL========================");
		
		Optional<Employee> minSal =employess.stream()
		.collect(Collectors.minBy(Comparator.comparing(s->s.getSal())));
		 System.out.println("Min sal employee is "+minSal.get());
		 
		 Optional<Employee> minSal1 =employess.stream()
					.collect(Collectors.minBy(Comparator.comparing(Employee::getSal)));
					
					 System.out.println("Min sal employee is "+minSal1.get());


	}

}
