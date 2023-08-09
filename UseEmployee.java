package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[]args) {
		
		Employee e1=new Employee("yamini",50000,"female");
		Employee e2=new Employee("mini",60000,"female");
		Employee[]e= {e1,e2};
		
		List<Employee>emp=Arrays.asList(e);
		
		List<Integer>emps=emp.stream()(x->x.getSalary()+10000).collect(Collectors.toList());

	}

}
