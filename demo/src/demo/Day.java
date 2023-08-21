
package demo;
class Day {

	public static void main(String[] args) {
		//Dint[] day= {7};
		try {
		switch(args[0])
		{
		case "Mon": 
		case "Tue": 
		case "Wed": 
		case "Thu":
		case "Fri": System.out.println("Working Day");
					break;
		case "Sat": 
		case "Sun": System.out.println("Working Day");
					break;
		default: System.out.println("Invalid Day");
		}
		}catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);}	
		
	}

}
