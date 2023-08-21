package Day10programs;
import java.util.Arrays;
import java.util.Scanner;

public class DigonalSum {

		int getDigonalSum(int a[][])
		{
			int sum=0;
			int ans[]=new int[3];
			for(int i=0;i<a.length;i++)
			{
				
				for(int j=0;j<a.length;j++)
				{
					if(i==j)
					sum+=a[i][j];
				}
				ans[i]=sum;
			}
			return sum;
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
			DigonalSum gm=new DigonalSum();
			int ans=gm.getDigonalSum(a);
			System.out.println("Row Sum :"+ans);
		}
			else System.out.println("null");
	}
}



