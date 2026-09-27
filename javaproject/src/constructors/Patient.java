package constructors;

public class Patient {
	int Patient_ID;
	String Patient_Name;
	String Disease;
	double Bill_Amount;
	public Patient(int Patient_ID) {
		this.Patient_ID = Patient_ID;
		System.out.println("enter patient details \nPatient_ID: " + Patient_ID);
	}
	public Patient(int Patient_ID,String Patient_Name) {
		this(Patient_ID);
		this.Patient_Name = Patient_Name;
		System.out.println("Patient_Name: " + Patient_Name);
	}
	public Patient(int Patient_ID,String Patient_Name,String Disease) {
		this(Patient_ID,Patient_Name);
		this.Disease = Disease;
		System.out.println("Disease: " + Disease);
	}
	public Patient(int Patient_ID,String Patient_Name,String Disease,double Bill_Amount) {
		this(Patient_ID,Patient_Name,Disease);
		this.Bill_Amount = Bill_Amount;
		System.out.println("Bill_Amount: " + Bill_Amount);
	}
	public static void main(String[]args) {
		Patient p = new Patient(101,"Ashritha","Viral Fever",2000.0);
	}
	
}
