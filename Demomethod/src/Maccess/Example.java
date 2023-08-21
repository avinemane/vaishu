package Maccess;

public class Example {
	int x = m1();
	int m1() {
		System.out.println("NSV is Executed");
		return 10;
	}
	{
	System.out.println("NSB1 is Executed");
}
Example(){
	System.out.println("NPC is Executed");
	}
Example(String S){
	System.out.println("SPC is Executed");
}
{
	System.out.println("NSB2 is Executed");
}
int y =m2();
int m2() {
	System.out.println("NSV2 is Executed");
	return 20;
}
public static void main(String[] args) {
	System.out.println("MM Is Start");
	Example t1=new Example();
	Example t2=new Example();
	System.out.println("MM is end");
}
int z=m3();
int m3() {
	System.out.println("NSV3 is Executed");
	return 30;
}
{
	System.out.println("NSB3 is Executed");
}
void m4() {
	System.out.println("NSM is Executed");
}
}