package methods;
import java.util.*;
public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	String employeeCompanyName;
	public Employee() {
	}
	public static void main(String [] args) {
		
		Employee e1 = new Employee();
		e1.employeeId = 101;
		e1.employeeName = "Ashritha";
		e1.employeeSalary = 2000.00;
		e1.employeeCompanyName = "TCS";
		System.out.println("employeeId is :"+  e1.employeeId);
		System.out.println("employeeName is :"+ e1.employeeName);
		System.out.println("employeeSalary is  :"+ e1.employeeSalary);
		System.out.println("employeeCompanyName is :" + e1.employeeCompanyName);
	}

}
