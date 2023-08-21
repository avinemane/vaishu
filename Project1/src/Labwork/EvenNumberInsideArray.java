package Labwork;

public class EvenNumberInsideArray {
	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println("element of given array present on even position: ");
		for(int i=1;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}

	}
}
