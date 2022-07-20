package com.bridgelabz.lineComparision;
import java.util.Scanner;
public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation");
		
Line line1 = new Line();
double l1=calculatelength(line1);
System.out.println(l1);
	}
	
	//UC1
	public static double calculatelength(Line line) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("enter the value of x1= ");
		line.setX1(scan.nextDouble());
	
		System.out.print("enter the value of y1= ");
		line.setY1(scan.nextDouble());
		
		System.out.print("enter the value of x2= ");
		line.setX2(scan.nextDouble());
		
		System.out.print("enter the value of y2= ");
		line.setY2(scan.nextDouble());
		scan.close();
		
		double xCord = line.getX2()-line.getX1();
		double xCordSquare=xCord*xCord;
		double yCord = line.getY2()-line.getY1();
		double yCordSquare=yCord*yCord;
	double lengthofline= Math.sqrt(xCordSquare+yCordSquare);
		System.out.println("Length of given line is = "+lengthofline);
		return lengthofline;
	}

}
