package com.collectionFramework;
class Pen
{
	String name;
	String color;
	double price;
	Pen(String name, String color, double price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public String toString() 
	{
		return "Pen name is:" +name+ " color:" +color+ " price:" +price; 
	}
}
public class Mainclass8 
{
	public static void main(String[] args) 
	{
		Pen p;
		p=new Pen("Bollpen","Black",120.00);
		p=new Pen("Gellpen","Blue",100.00);
		System.out.println(p);
		
		System.out.println(p.name +" "+ p.color +" "+ p.price);
	}
}
