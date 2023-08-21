package array;

public class Find_No_Of_Occurances {
	public static void main(String[] args) {
		String str = "hellooplksooswijdjffh";
		int length = str.length();
		int count = 0;
		char search = 'o';//this char how many times in the string.
		for (int i = 0; i < length; i++) {
		    if (str.charAt(i) == search) {

		        count++;
		    }
		}

		System.out.println(count);
	}
}
