package day_5;

public class Tester {
	public static void main(String[] args) {
		Person p = new Person(3,3,1990);
		p.computeDestiny();
		Numerology nu = new Numerology();
		nu.loadHashMap();
		nu.getProperties(p);
		//nu.planetsChar(3,3,1990);
		System.out.println(nu.getProperties(p));
	}
}
