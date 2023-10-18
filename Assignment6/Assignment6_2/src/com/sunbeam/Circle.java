package com.sunbeam;

import java.util.Scanner;

public class Circle {
		Point2D point;
		double myDiameter;
		
		public Circle() {
			this.point = new Point2D(0,0);
			this.myDiameter = 100.0;
		}
		
		public void accept() {
			System.out.println("Enter the Co-ordinates: ");
			int x  = new Scanner(System.in).nextInt();
			int y  = new Scanner(System.in).nextInt();
			point = new Point2D(x,y);
			System.out.println("Enter the Diameter: ");
			this.myDiameter = new Scanner(System.in).nextDouble();
			invariant();
		}
		
		public Point2D getPoint() {
			return point;
		}

		public double getMyDiameter() {
			return myDiameter;
		}
		
		public void invariant() {
			if(myDiameter < 0) 
				throw new NegativeDiameterException(myDiameter);
		}

		@Override
		public String toString() {
			return "Circle [point=" + point + ", myDiameter=" + myDiameter + "]";
		}
		
}