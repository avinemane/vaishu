package Day10programs;

import java.util.Arrays;
import java.util.Scanner;

public class RowSum {
	int[] getRowSum(int a[][])
	{
		int ans[]=new int[3];
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				sum+=a[i][j];
			}
			ans[i]=sum;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Size :");
		int r=sc.nextInt();
		System.out.println("Enter Column Size :");
		int c=sc.nextInt();
		if(r==3 && c==3)
		{
			int a[][]=new int[r][c];
			System.out.println("Enter elements :");
			for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		RowSum rm=new RowSum();
		int ans[]=rm.getRowSum(a);
		System.out.println("Row Sum :"+Arrays.toString(ans));
	}
		else System.out.println("null");
}
}
