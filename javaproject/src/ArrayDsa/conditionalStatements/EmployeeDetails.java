package conditionalStatements;

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class EmployeeDetails {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee experience");
		byte experience = sc.nextByte();
		System.out.println("Employee departmentID");
		Short departmentID = sc.nextShort();
		System.out.println("EmployeeID is");
		int employeeID = sc.nextInt();=-
		System.out.println("Employee mobileNumber");
		long mobileNumber = sc.nextLong();
		System.out.println("Employee height");
		float height = sc.nextFloat();
		System.out.println("Employee salary");
		double salary = sc.nextDouble();
		System.out.println("filePresent is (TRUE/FALSE)");
		boolean filePresent=sc.nextBoolean();
		System.out.println("Employee aadhaar");
		BigInteger aadhaar = sc.nextBigInteger();
		System.out.println("Employee bonus");
		BigDecimal bonus = sc.nextBigDecimal();
		System.out.println("employeeSurname is");
		String employeeSurname = sc.nextLine();
		System.out.println("employeeFullName is");
		String employeeFullName = sc.nextLine();
		System.out.println("Employee maritalStatus (M/U)");
		char maritalStatus = sc.next().charAt(0);
		System.out.println("\n---------EmployeeDetails---------");
		System.out.println("Employee experience" + " " + experience);
		System.out.println("Employee departmentID" + " " + departmentID);
		System.out.println("EmployeeID is"+ " " + employeeID );
		System.out.println("Employee mobileNumber" + " " + mobileNumber);
		System.out.println("Employee height"+" " + height);
		System.out.println("Employee salary" + " " + salary);
		System.out.println("filePresent is"+ " " + filePresent);
		System.out.println("Employee aadhaar"+ " " + aadhaar);
		System.out.println("Employee bonus"+ " "+ bonus);
		System.out.println("employeeSurname"+ " " + employeeSurname);
		System.out.println("employeeFullName"+ " "+ employeeFullName);
		System.out.println("Employee maritalStatus" + " "+maritalStatus);
		
	}

}
