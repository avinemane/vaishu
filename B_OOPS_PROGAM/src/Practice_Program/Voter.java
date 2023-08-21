package Practice_Program;

public class Voter {
	private int age;
	public void setAge(int age) {
		this.age = age;
		if(age<18)
			this.age=18;
		else if(age>60)
			this.age=60;
		else
			this.age=age;
	}
	public int getAge() {
		return age;
		
	}
	public static void main(String[] args) {
		Voter v = new Voter();
		v.setAge(20);
		int n = v.getAge();
		System.out.println(n);	
	}

}
