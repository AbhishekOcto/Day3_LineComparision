package com.bridgelabz.lineComparision;

import java.util.Scanner;

public class LineComparisionUC3 {
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation");
		
Line line1 = new Line();
double l1=calculatelength(line1);
System.out.println(l1);

Line line2 = new Line(); //UC2
double l2 = calculatelength(line2);
System.out.println(l2);

//String s1 = Double.toString(l1);
//String s2 = Double.toString(l2);



	
	if (l1>l2){
		System.out.println("line 1 is greater than line 2");
	}
	
	else if (l2>l1){
	System.out.println("line2 is greater than line 1");
	}
	
	else {
		System.out.println("lines are equal");
	}
	scan.close();
	
	}

	
	//user inputs for line 1 and line 2
	public static double calculatelength(Line line) {
		
		
		System.out.print("enter the value of x1= ");
		line.setX1(scan.nextDouble());
	
		System.out.print("enter the value of y1= ");
		line.setY1(scan.nextDouble());
		
		System.out.print("enter the value of x2= ");
		line.setX2(scan.nextDouble());
		
		System.out.print("enter the value of y2= ");
		line.setY2(scan.nextDouble());
		
		
		double xCord = line.getX2()-line.getX1();
		double xCordSquare=xCord*xCord;
		double yCord = line.getY2()-line.getY1();
		double yCordSquare=yCord*yCord;
	double lengthofline= Math.sqrt(xCordSquare+yCordSquare);
		System.out.println("Length of given line is = "+lengthofline);
		return lengthofline;
	}
}
