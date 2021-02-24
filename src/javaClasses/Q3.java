package javaClasses;

class Rectangle{
	
	int length;
	int breadth;

	//method to return the area
int Area(int l, int b) {
	length = l;
	breadth = b;
	return (l*b);
	
}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating objects
		Rectangle rectone = new Rectangle();
		Rectangle recttwo = new Rectangle();
		
	    //displaying the area of the rectangles
		System.out.println("The Area of the rectangle is " + rectone.Area(4,5) + " units");
		System.out.println("The Area of the rectangle is " + recttwo.Area(5,8) + " units");

	}

}
