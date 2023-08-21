package array;

import java.util.Scanner;

public class FindDuplicate {

		void findDuplicate(int a[])
		{
			for(int i=0;i<a.length;i++)
			{
				int count=0;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]!='$')
					{
						if(a[i]==a[j])
						{
							count++;a[j]='$';
						}
					}
				}
				if(count>=0)System.out.println(a[i]+" Founded "+count+" Time");
			}
			
			
		}
			@SuppressWarnings("resource")
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter array size: ");
				int a[]=new int[sc.nextInt()];
				System.out.println("Enter array element: ");
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
					
				};
				FindDuplicate f = new FindDuplicate();
				f.findDuplicate(a);
			}			
}


