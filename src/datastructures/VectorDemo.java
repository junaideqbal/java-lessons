package datastructures;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector(3, 2);
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());
		
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		
		System.out.println("Initial size: " + v.size());
		System.out.println("Capacity after for additions: " + v.capacity());
		
		v.addElement(new Float(9.4));
		v.addElement(new Double(5.45));

		System.out.println("Initial size: " + v.size());
		System.out.println("Current capacity: " + v.capacity());
		
		System.out.println("First Element" + v.firstElement());
		System.out.println("Last Element" + v.lastElement());
		
		if (v.contains(new Integer(3))) {
			System.err.println("Vector contain 3.");
		}
		
		Enumeration vEnum = v.elements();
		
		while(vEnum.hasMoreElements()) {
			System.err.println(vEnum.nextElement());
		}
		
		
	}

}
