package Day10programs;
import java.util.Scanner;

public class Program2 {
	
	
		public static void main(String[] args) {

		    int[] number=new int[6];
		    Scanner ss=new Scanner(System.in);

		    for (int j = 0; j < number.length; j++) {
		        number[j]=ss.nextInt();

		    }

		    firstLast6( number);
		    System.out.print(firstLast6(number));
		}



		 public  static boolean firstLast6( int[] nums ) {

		     if ( nums.length>0 && nums[0]==nums[nums.length-1] ){
		                   return true;
		     }
		     else{

		         return false;

		     }
		}
}
