package com.niit.projcla.bean;
import java.util.*;
class Produce 
{
int id;
String pname;
double price;
Produce(int i,String name,double p)
{
    id=i;
    pname=name;
    price=p;
}
Produce()
{}
public int getId() {
	return id;
}
public void setId(int i) 
{
	id= i;
}
public String getPname() 
{
	return pname;
}
public double getPrice() 
{
	return price;
}
public String toString()
{
	return id+" "+" ";
}
 public boolean equlas(Object o)
{
	Produce p=(Produce)o;
	return(getId()==p.getId());
}
public int hashCode()
{
	final int N=129;
	int d=1;
	int result=d*N+this.id;
	return result;
}
public static void main(String[] args) 
{
    Produce p1= new Produce(1,"lamborghini",20000000.55d);
    System.out.println(p1);
	Produce p2 = new Produce(2,"maserati",15000000.55d);
	System.out.println(p2);
	boolean t=p1.equals(p2);
	System.out.println(t);
	Produce p3=p1;
    System.out.println(p1.equals(p3));
    Produce p4=new Produce();
    Produce p5= new Produce();
    p4.setId(100);
    p5.setId(100);
    System.out.println(p4.equals(p5));
    System.out.println(p4.hashCode());
    System.out.println(p5.hashCode());
    HashSet hs=new HashSet();
    hs.add(p4);
    hs.add(p5);
    System.out.println(hs);
   }
}
