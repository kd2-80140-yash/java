package com.sunbeam;

public class NegativeDiameterException extends RuntimeException{
		double fieldValue;
		
		public NegativeDiameterException(double fieldValue) {
			this.fieldValue = fieldValue;
		}
		
		@Override
		public String toString() {
			return "Diameter Cannot be Negative";
		}
	}

