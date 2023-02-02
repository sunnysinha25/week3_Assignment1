/*
Question2

employee - > id , name, salary
collection of emp objects-> mapper -> salary incremented by 10%
*/

package week3_Assignment1.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
	}
		
}

public class Mapper {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		List<Employee> target=new ArrayList<Employee>();
		
		empList.add(new Employee(101,"Sunny",45000));
		empList.add(new Employee(102,"Anand",150000));
		empList.add(new Employee(103,"Anupam",20000));
		empList.add(new Employee(104,"Prakash",35000));
		empList.add(new Employee(105,"Naveen",25000));
		
		System.out.println("SALARY DETAILS BEFORE INCREMENT: ");
		empList.forEach(System.out::println);
		
		target = empList.stream().map(e->new Employee(e.id, e.name, e.salary+0.1*e.salary)).collect(Collectors.toList());
		System.out.println("\n\n\nSALARY DETAILS AFTER INCREMENT: ");
		target.forEach(System.out::println);
	}
}

/*
EXPECTED INPUT/OUTPUT
SALARY DETAILS BEFORE INCREMENT: 
Employee [ID=101, Name=Sunny, Salary=45000.0]
Employee [ID=102, Name=Anand, Salary=150000.0]
Employee [ID=103, Name=Anupam, Salary=20000.0]
Employee [ID=104, Name=Prakash, Salary=35000.0]
Employee [ID=105, Name=Naveen, Salary=25000.0]



SALARY DETAILS AFTER INCREMENT: 
Employee [ID=101, Name=Sunny, Salary=49500.0]
Employee [ID=102, Name=Anand, Salary=165000.0]
Employee [ID=103, Name=Anupam, Salary=22000.0]
Employee [ID=104, Name=Prakash, Salary=38500.0]
Employee [ID=105, Name=Naveen, Salary=27500.0]
*/
