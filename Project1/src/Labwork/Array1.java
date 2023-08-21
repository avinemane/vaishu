package Labwork;

public class Array1 {
	static int arr[]= {12,5,6,48};
	public Array1(int i) {
		// TODO Auto-generated constructor stub
	}
	public void Array(int i) {
		// TODO Auto-generated constructor stub
	}
	static int elementAddition() {
		int sum=0;
		int i;
		for(i=0;i<arr.length;i++)
			sum +=arr[i];
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("sum of given array is"+elementAddition());
	}
}
