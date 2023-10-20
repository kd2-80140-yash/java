package com.sunbeam;

public class Labor implements Employee
{
	private int hours;
	private int rate;
	
	public Labor(int hours, int rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}
	@Override
	public double getSal() {
		return hours * rate;
	}
	@Override
	public double calcIncentives() {
		if (hours > 300)
			return 0.05 * rate;
		return 0;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Labor [hours=" + hours + ", rate=" + rate + "]";
	}
}
