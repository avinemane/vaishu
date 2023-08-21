package day_5;

public class Person {
	int date;
	int month;
	int year;
	int destinyNum;
	
	Person(int date,int month,int year)
	{
		this.date       = date;
		this.month      = month;
		this.year       = year;
		//this.destinyNum = destinyNum;
	}
	void computeDestiny()
	{
		int sum=0;
		String s = ""+date+month+year;
		int n    = Integer.parseInt(s);
		while(n!=0)
		{
			sum = sum+n%10;
			n=n/10;
		}
		destinyNum = sum;
	}
	
}	
