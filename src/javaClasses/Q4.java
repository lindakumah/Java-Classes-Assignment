package javaClasses;

import java.util.Scanner;

class Area{
	
	int length;
	int breadth;

	//constructor
Area(){}	
	
Area(int l, int b) {
	length = l;
	breadth = b;
}

    //method to return the area
int returnArea() {
	return(length*breadth);
	
}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the length of the rectangle: ");
		int len = input.nextInt();
		
		System.out.print("Please enter the breadth of the rectangle: ");
		int bre = input.nextInt();
		
		//creating objects
		Area rect = new Area(len,bre);
		
	    //displaying the area of the rectangles
		System.out.println("The area of the rectangle is " + rect.returnArea() + " units");

	}

}
