package com.sunbeam;

public class Point2D 
{
	
	    private double x;
	    private double y;

	    public Point2D(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    public String getDetails() {
	        return "(" + x + ", " + y + ")";
	    }

	    public boolean isEqual(Point2D other) {
	        return this.x == other.x && this.y == other.y;
	    }

	    public double calculateDistance(Point2D other) {
	        double deltaX = this.x - other.x;
	        double deltaY = this.y - other.y;
	        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	    }
	}


