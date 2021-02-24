package javaClasses;

class Triangle{
	
	int a;
	int b;
	int h;
	
void formula() {
	System.out.println("The area of the triangle is " + ((b*h)/2) + " units");
	System.out.println("The perimeter of the triangle is " + (a+b+h) + " units");
}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle triangleone = new Triangle();
		triangleone.a = 3;
		triangleone.b = 4;
		triangleone.h = 5;
		
		triangleone.formula();
		
	}

}
