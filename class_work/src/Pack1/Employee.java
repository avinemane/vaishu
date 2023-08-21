package Pack1;
import static java.lang.System.*;
import java.util.*;

public class Employee {
	int empNo;
	String name;
	float salary;
	Employee(int empNo,String name,float sal)
	{
		this.empNo=empNo;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return empNo+"\t"+name+"\t"+salary;
	}
}
class Demo{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String option;
		Employee[] e=new Employee[100];
		int i=0;
		//String "yes";
		do
		{
			System.out.println("Enter Employee Number: ");
			int empNo=s.nextInt();
			
			System.out.println("Enter Employee name: ");
			String name=s.next();
			
			System.out.println("Enter Employee sal: ");
			i++;
			System.out.println("Do you want to continue? ");
			option = s.next();
		}
		while(option.equalsIgnoreCase("yes"));
		for(int j=0;j<i;j++) {
			System.out.println(e[j]);
		}
	}
}
