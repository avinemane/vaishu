package Practice;

//import java.util.*;
public class For_Loop_EvenOdd {
	public static void main(String[] args) {
		int a []= {2,4,5,8,10,33,9,0};
		System.out.println("Odd number");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
		}
	}
     System.out.println("Even Number");
     for(int i=0;i<a.length;i++) {
    	 if(a[i]==0) {
    		 System.out.println(a[i]);
    	 }
     }
	}
}
