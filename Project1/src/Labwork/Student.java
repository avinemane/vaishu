package Labwork;
import java.io.Serializable;
import java.util.Scanner;
 public class Student {
	
		int stid,marks;
		String name;
		static java.lang.String C;
		 static char grade;	
		 public static void main(String[] args) {
			
		}
		Student(){
			
		}
		Student(int stid,String n,int marks){
			this.stid=stid;
			name=n;
			this.marks=marks;
			calculateGrade();
			displayDetails();
			System.out.println(C);//USE GRADE IF U WANT ONLY GRADE
		}
		java.lang.String displayDetails() {
			C="student name -"+name+
					" student id - "+stid+
					" marks - "+marks+
					" grade - "+grade;
			return C;
		}
		void calculateGrade() {
			if(marks>90)grade='A';
			else if(marks>=81 && marks <=90)grade='B';
			else if(marks>=71 && marks <=90)grade='C';
			else if(marks>=61 && marks <=90)grade='D';
			else if(marks<61 )grade='E';
		}
}

class tester{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    	System.out.println("enter student id");
			int stid=s.nextInt();
			System.out.println("enter student Name");
			Serializable n=s.next();
			System.out.println("enter student marks");
			int marks=s.nextInt();
				new Student();
		}
	}
	
	
		


