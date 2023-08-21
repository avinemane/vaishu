package day_5;

import java.util.*;
public class Numerology {
	HashMap<Integer,String>planets;
	HashMap<String,String>planetsChar;
	
	void loadHashMap()
	{
		planets = new HashMap<>();
		planets.put(1, "Sun");
		planets.put(2, "Moon");
		planets.put(3, "Mars");
		planets.put(4, "Rahu");
		planets.put(5, "Mercury");
		planets.put(6, "Venus");
		planets.put(7, "Ketu");
		planets.put(8, "Saturn");
		planets.put(9, "Jupiter");
	}
	
	void loadHashMapChar() 
	{
		planetsChar = new HashMap();
		planetsChar.put("Sun", "Confidence");
		planetsChar.put("Moon", "Emotions");
		planetsChar.put("Sun", "Knowledge");
		planetsChar.put("Sun", "Extravagance");
		planetsChar.put("Sun", "Intelligence");
		planetsChar.put("Sun", "Beauty");
		planetsChar.put("Sun", "Philosophy");
		planetsChar.put("Sun", "Dicipline");
		planetsChar.put("Sun", "Vitality");
	}
	public String getProperties(Person p)
	{
		return "The character of person with+p.date"+"+p.year"+"birth date is"+planetsChar.get(planets.get(p.destinyNum));
		
	}
}