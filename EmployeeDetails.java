package week2.day1;

public class EmployeeDetails {
	public String empdetail(String EmpName, int EmpId) {
System.out.println("EmployeeName :"+EmpName);
System.out.println("EmployeeId :"+EmpId);
return null;

}
	public String EmployeeAddress(String Empaddress) {
		System.out.println("EmployeeName :"+Empaddress);
	
		return null;
	}
	public String EmployeeNumber(int empNum) {
		System.out.println("employeenum :"+empNum);
		return null;
	}
	public String Employeesalery(int empsalery) {
		System.out.println("employeenum :"+empsalery);
		return null;
	}
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.empdetail("eshwaa", 06);
		emp.EmployeeAddress("salem");
		emp.EmployeeNumber(1234567890);
		emp.Employeesalery(50000);
		
	}
	}
