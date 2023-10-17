package com.tester;
import com.app.geometry.Point2D;
import java.util.Scanner;

	public class TestPointArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of points to plot: ");
	        int numPoints = scanner.nextInt();

	        Point2D[] points = new Point2D[numPoints];

	        for (int i = 0; i < numPoints; i++) {
	            System.out.println("Enter the coordinates for point " + (i + 1) + " (x y):");
	            double x = scanner.nextDouble();
	            double y = scanner.nextDouble();
	            points[i] = new Point2D(x, y);
	        }

	        int choice;
	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Display details of a specific point");
	            System.out.println("2. Display x, y coordinates of all points");
	            System.out.println("3. Display distance between specified points");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the index of the point: ");
	                    int index = scanner.nextInt();
	                    if (index >= 0 && index < numPoints) {
	                        Point2D selectedPoint = points[index];
	                        System.out.println("Details of the selected point: " + selectedPoint.getDetails());
	                    } else {
	                        System.out.println("Invalid index. Please retry.");
	                    }
	                    break;

	                case 2:
	                    System.out.println("X and Y coordinates of all points:");
	                    for (Point2D point : points) {
	                        System.out.println(point.getDetails());
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter the index of the start point: ");
	                    int startIndex = scanner.nextInt();
	                    System.out.print("Enter the index of the end point: ");
	                    int endIndex = scanner.nextInt();

	                    if (startIndex >= 0 && startIndex < numPoints && endIndex >= 0 && endIndex < numPoints) {
	                        Point2D start = points[startIndex];
	                        Point2D end = points[endIndex];

	                        if (!start.isEqual(end)) {
	                            double distance = start.calculateDistance(end);
	                            System.out.println("Distance between the specified points: " + distance);
	                        } else {
	                            System.out.println("The specified points are located at the same position.");
	                        }
	                    } else {
	                        System.out.println("Invalid indices. Please retry.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting the program.");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please retry.");
	            }
	        } while (choice != 4);

	        scanner.close();
	    }
	}


