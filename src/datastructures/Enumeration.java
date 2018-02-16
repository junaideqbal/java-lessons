package datastructures;

import java.util.Iterator;
import java.util.Vector;

public class Enumeration {
	
	Vector dayNames = new Vector();
	
	public static void main(String[] args) {
		java.util.Enumeration day;
		Vector dayNames = new Vector();
		dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      day = dayNames.elements();
	      while (day.hasMoreElements()) {
	          System.out.println(day.nextElement()); 
	       }
	}

}
