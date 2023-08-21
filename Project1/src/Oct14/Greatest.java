package Oct14;

public class Greatest{
	int getGreatest(int a,int b)
	{
		if(a<0 | b<0)return -1;
		if(a==0 | b==0)return -2;
		if(a>b)
		{
			return a;
		}
		else return b;
	}
	public static void main(String[] args)
	{
		Greatest g1 = new Greatest();
		int y=g1.getGreatest(30, -66);
		System.out.println(y);
	}
}
