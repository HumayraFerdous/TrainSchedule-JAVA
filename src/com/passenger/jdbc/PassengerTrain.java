package com.passenger.jdbc;

import java.util.Scanner;

public class PassengerTrain implements Testbase,TestPassenger{
	public String name;
	  public String offday;
	  public String destin;
	  public String type;
	  public double price;
	  Scanner s=new Scanner(System.in);
	  public void getname()
	  {
	    System.out.print("\tTrain name: ");
	    name=s.nextLine();
	  }
	  public void getoffday()
	    {
		  System.out.print("\tOffday: ");
	    offday=s.nextLine();
	    }
	  public void getdestin()
	    {
		  System.out.print("\tDestination: ");
	    destin=s.nextLine();
	    }
	  
	  public void inputcompart()
	  {
	    System.out.print("\n\tEnter Compartment: ");
	    type=s.nextLine();
	  }
	  public void inputprice()
	  {
		  System.out.print("\n\tEnter Price: ");
	    price=s.nextFloat();
	  }
	  public void displayname()
	  {
	    System.out.print(name);
	  } 
	  public void displayoffday()
	  { 
		  System.out.print(offday);
	}
	  public void displaydestin()
	  { System.out.print(destin);
	  }
	  public void outputcompart()
	  {
	    System.out.print(type);
	  }
	  public void outputprice()
	    {
		  System.out.print(price);
	    }
	}



