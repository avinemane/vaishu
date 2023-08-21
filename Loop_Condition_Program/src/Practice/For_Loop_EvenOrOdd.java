package Practice;

//import java.util.*;
public class For_Loop_EvenOrOdd {
	public static void main(String[] args) {
		int a[]= {1,2,5,6,2,3};
		System.out.println("Odd number");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
		}
	}
     System.out.println("Even Number");
     for(int i=0;i<a.length;i++) {
    	 if(a[i]%2==0) {
    		 System.out.println(a[i]);
    	 }
     }
	}
}
