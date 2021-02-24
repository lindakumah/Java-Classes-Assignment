package javaClasses;

import java.util.Scanner;

class Complex{
	double real;
	double imag;

 //Constructors
Complex(){}

Complex(double real1, double imag1){
    real = real1;
    imag = imag1;
}

 //method to return the sum
public static Complex sum(Complex a, Complex b) {
	return new Complex((a.real + b.real), (a.imag + b.imag));
}

 //method to return the difference
public static Complex difference(Complex a1, Complex b1) {
	return new Complex((a1.real - b1.real), (a1.imag - b1.imag));
}

 //method to return the product
public static Complex product(Complex a2, Complex b2) {
	return new Complex((a2.real * b2.real), (a2.imag * b2.imag));
}
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the real part of the first complex number: ");
		double realnum1 = input.nextDouble();
		
		System.out.print("Please enter the imaginary part of the first complex number: ");
		double imagnum1 = input.nextDouble();
		
		System.out.print("Please enter the real part of the second complex number: ");
		double realnum2 = input.nextDouble();
		
		System.out.print("Please enter the imaginary part of the second complex number: ");
		double imagnum2 = input.nextDouble();
		
		Complex complexNum1 = new Complex(realnum1, imagnum1);
		Complex complexNum2 = new Complex(realnum2, imagnum2);
		Complex A = new Complex();
		Complex B = new Complex();
		Complex C = new Complex();
		
		A = A.sum(complexNum1, complexNum2);
		B = B.difference(complexNum1, complexNum2);
		C = C.product(complexNum1, complexNum2);
		
	    System.out.println("The sum of the two complex numbers is " + A.real + " +" + A.imag + "i");
	    System.out.println("The difference of the two complex numbers is " + B.real + " +" + B.imag + "i");
	    System.out.println("The product of the two complex numbers is " + C.real + " +" + C.imag + "i");
		
		
		
		
		
		

	}

}
