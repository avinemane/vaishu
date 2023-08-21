package Pack1;


//Progam to demonstrate serialization OR 
	//Progranm to demonstrate object stream


import java.io.*;
import java.util.*;

 class Emp1 implements Serializable {
	
		int empNo;
		String name;
		float salary;
		Emp1(int empNo,String name,float salary)
		{
			this.empNo  = empNo;
			this.name   = name;
			this.salary = salary;
		}
		public String toString()
		{
			return empNo+"\t"+name+"\t"+salary;
		}
	}
	class Employee2
	{
		public static void main(String[] args) 
		{
			try
			{
				Scanner s = new Scanner(System.in);
				System.out.println("Enter Employee Number: ");
				int empNo=s.nextInt();
				System.out.println("Enter Employee Name: ");
				String name=s.next();
				System.out.println("Enter Employee Salary: ");
				float salary=s.nextFloat();
				Emp1 e1 = new Emp1(empNo,name,salary);

				FileOutputStream fos = new FileOutputStream("Emp1.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(e1);
				//Emp1 e1 = (Emp1)oos.readObject(fos);
				//System.out.println(e1);
				oos.close();
				fos.close();
					
				FileInputStream fis = new FileInputStream("Emp1.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Emp1 e2 =(Emp1)ois.readObject();
				System.out.println(e2);
				ois.close();
				fis.close();
			}catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}





