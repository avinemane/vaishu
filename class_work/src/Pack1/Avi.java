package Pack1;
import java.util.Scanner;
public class Avi {
	public static  boolean firstLast6( int[] nums ) {

		 if ( nums.length>0 && nums[0]==nums[nums.length-1] ){
			                   return true;
		 }
	     else{

		  return false;
		 }	
	}

	public static void main(String[] args) {
		
		 int[] number=new int[6];
		 Scanner ss=new Scanner(System.in);
		// Avi a = new Avi();
			//Avi.firstLast6(number);
		 for (int j = 0; j < number.length; j++) {
		 number[j]=ss.nextInt();

		 }

		 firstLast6( number);
		 System.out.print(firstLast6(number));
	}

}
