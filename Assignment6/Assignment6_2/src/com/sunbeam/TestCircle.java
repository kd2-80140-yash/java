package com.sunbeam;



	public class TestCircle {

		public static void main(String[] args) {
			Circle circle = new Circle();
			
			try {
			circle.accept();
			System.out.println(circle);
			}
			catch(NegativeDiameterException error) {
				System.err.println(error);
			}
		}

	}

