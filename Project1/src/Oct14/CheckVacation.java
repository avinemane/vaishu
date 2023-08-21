package Oct14;

public class CheckVacation {
	
	String ringAlarm(int a,boolean b)
	{
    if(a==0|a==6&b==true)return "weekday "+" on vacation "+" off";
    else if(a==0|a==6&b==false)return "weekday "+" not on vacation "+"10:00 ";
    else if(a<0|a>5)return "invalid inputs";
    else if(b!=true&b!=false)return"invalid inputs";
    else if(a>0&a<6&b==true)return"weekday "+" on vacation "+" 10:00";
    else if(a>0&a<6&b==false)return"weekdaay "+" not on vacation "+"07:00 ";
    return ringAlarm(a,b);
    }
	public static void main(String[] args)
	{
		CheckVacation c1 = new CheckVacation();
		String x=c1.ringAlarm(0,true);
		System.out.println(x); 
	}
}
