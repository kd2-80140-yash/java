package com.sunbeam;

public class Manager implements Employee
{
	
		private double basicSalary;
		private double dearanceAllowance;

		public Manager(double basicSalary, double dearanceAllowance) {
			this.basicSalary = basicSalary;
			this.dearanceAllowance = dearanceAllowance;
		}

		public double getBasicSalary() {
			return basicSalary;
		}

		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}

		public double getDearanceAllowance() {
			return dearanceAllowance;
		}

		public void setDearanceAllowance(double dearanceAllowance) {
			this.dearanceAllowance = dearanceAllowance;
		}

		@Override
		public double getSal() {
			return basicSalary + dearanceAllowance;
		}

		@Override
		public double calcIncentives() {
			return 0.20 * basicSalary;
		}

		@Override
		public String toString() {
			return "Manager [basicSalary=" + basicSalary + ", dearanceAllowance=" + dearanceAllowance + "]";
		}
	}

