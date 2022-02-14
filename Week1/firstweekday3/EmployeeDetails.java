package firstweek3day;
import java.util.Scanner;
public class EmployeeDetails {
	public void employeename()
	{
		String EmployeeName="Theeran";
		int Employeeid=203;
		System.out.println(EmployeeName);
		System.out.println(Employeeid);
	}
	public void EmployeeAddress()
	{
		String a;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Address:");
		a=in.nextLine();
		System.out.println(a);
	}
	public void EmployeeSalary()
	{
		double Empsalary=15000.00;
		System.out.println(Empsalary);
	}
	public void EmployeeMobilenumber()
	{
		long mobnum=988358122l;
		System.out.println(mobnum);
	}

	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.employeename();
		emp.EmployeeAddress();
		emp.EmployeeSalary();
		emp.EmployeeMobilenumber();

	}

}
