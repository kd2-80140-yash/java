package com.carcost;

import java.util.Scanner;

public class Dailycar
{
  private double totalmilesdrivenperday;
  private double costpergallon;
  private double averagemilespergallon;
  private int parkingfees;
  private int tollsperday;
  
  public Dailycar()
  {
	  this.totalmilesdrivenperday = 0.0;
	  this.costpergallon = 0.0;
	  this.averagemilespergallon = 0.0;
	  this.parkingfees = 0;
	  this.tollsperday = 0;
  }

public Dailycar(double totalmilesdrivenperday, double costpergallon, double averagemilespergallon, int parkingfees,
		int tollsperday)
{

	this.totalmilesdrivenperday = totalmilesdrivenperday;
	this.costpergallon = costpergallon;
	this.averagemilespergallon = averagemilespergallon;
	this.parkingfees = parkingfees;
	this.tollsperday = tollsperday;
}
public void acceptData()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total miles driven per day");
	this.totalmilesdrivenperday = sc.nextDouble();
	System.out.println("Enter the cost per gallon");
	this.costpergallon = sc.nextDouble();
	System.out.println("Enter average miles per gallon");
	this.averagemilespergallon = sc.nextDouble();
	System.out.println("Enter the parking fees");
	this.parkingfees = sc.nextInt();
	System.out.println("Enter the tolls per day");
	this.tollsperday = sc.nextInt();
	
}

public double getTotalmilesdrivenperday() {
	return totalmilesdrivenperday;
}

public void setTotalmilesdrivenperday(double totalmilesdrivenperday) {
	this.totalmilesdrivenperday = totalmilesdrivenperday;
}

public double getCostpergallon() {
	return costpergallon;
}

public void setCostpergallon(double costpergallon) {
	this.costpergallon = costpergallon;
}

public double getAveragemilespergallon() {
	return averagemilespergallon;
}

public void setAveragemilespergallon(double averagemilespergallon) {
	this.averagemilespergallon = averagemilespergallon;
}

public int getParkingfees() {
	return parkingfees;
}

public void setParkingfees(int parkingfees) {
	this.parkingfees = parkingfees;
}

public int getTollsperday() {
	return tollsperday;
}

public void setTollsperday(int tollsperday) {
	this.tollsperday = tollsperday;
}
 
public double Calculatedailycost()
{
	double milesperdrivenpergallon = totalmilesdrivenperday / averagemilespergallon;
	
	double totalcost = (milesperdrivenpergallon*costpergallon) + parkingfees + tollsperday;
	
	return totalcost;
}


  
}

