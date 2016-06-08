package com.niit.projcla.bean;
import java.util.*;
class Details
{
   int number;
   String carname;
   double cost;
   double mileage;
   
	Details()
	{}
	Details(int number,String carname,double cost,double mileage)
	{
	this.number=number;
	this.carname=carname;
	this.cost=cost;
	this.mileage=mileage;
	}
    void info()
	{
     System.out.println("serial number:"+ number);
	 System.out.println("The car name is:"+ carname);
	 System.out.println("The cost of the car is:"+ cost);
	 System.out.println("The mielage of the car is:"+ mileage);
	}
}
	class Lamborghini extends Details
    {
     Lamborghini()
	 {}
	 Lamborghini(int a,String b,double c,double d)
	 {
	 super(a,b,c,d);
	 }
	 
	}
	class Maserati extends Details
	{
	 Maserati()
	 {}
	 Maserati(int a,String b,double c,double d)
	 {
	  super(a,b,c,d);
	 }
	}
	class Porsche extends Details
	{
	 Porsche()
	 {}
	 Porsche(int a,String b,double c,double d)
	 {
	  super(a,b,c,d);
	 }
	}
	class HighCars
	{
	  public static void main(String[] args)
	   {
	     Lamborghini l=new Lamborghini(1,"Murcielago",25450000d,3.1d);
		 l.info();
		 Maserati m=new Maserati(2,"Ghibli",11120000d,3.0d);
		 m.info();
		 Porsche p=new Porsche(3,"Boxster",9350000d,5.5d);
	     p.info();
	   }
	   
	}