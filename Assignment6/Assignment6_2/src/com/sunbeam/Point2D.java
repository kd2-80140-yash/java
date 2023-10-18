package com.sunbeam;




import java.lang.Math;

public class Point2D {
	int x;
	int y;

	public Point2D() {
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		String s1 = Double.toString(x);
		String s2 = Double.toString(y);

		String s = "{" + s1 + "," + s2 + "}";
		return s;

	}

	public boolean isEqual(Point2D p1) {
		if (p1.x == this.x && p1.y == this.y)
			return true;
		else
			return false;
	}

	public void addPoint(Point2D p1) {
		double ans;
		ans = Math.sqrt(Math.pow((this.x - p1.x), 2) - Math.pow((this.y - p1.y), 2));
		System.out.println("The distance between the two points is: " + ans);
	}
}