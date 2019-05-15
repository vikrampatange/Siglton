package com.cg;

public class Siglton
{

	public static void main(String[] args)
	{
		
		Abc obj1=	Abc.getInstance();
		Abc obj2=Abc.getInstance();
		
		System.out.println("AFter returning object");
			
	}
}

class Abc
{
	
	//1 static object
	static Abc obj1=new Abc();
  
	//2don't allow to user create instance define constractgor private
	private Abc()
	{
	     	
	}
	
	//create static method
	public static Abc getInstance()
	{
		return obj1;
	}
	
}
