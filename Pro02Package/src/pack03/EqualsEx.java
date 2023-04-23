package pack03;

import pack01.Point;

public class EqualsEx {

	public static void main(String[] args) {
		Point a = new Point(2,3);	// 
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if(a.equals(b)) 					
			System.out.println("a is eauals to b");
		if(a.equals(b)) 
			System.out.println("a is eauals to b");
		if(a.equals(c)) 
			System.out.println("a is eauals to b");

	}

}
