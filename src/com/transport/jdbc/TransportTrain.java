package com.transport.jdbc;
import java.util.*;

public class TransportTrain implements testBase,TestTransport{
	 protected String name;
	  protected String offday;
	  protected String destin;
	  protected int number;
	  protected float size;
	  protected float price;
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
	  public void inputfurniture()
	  {
		 System.out.print("\tNumber of furniture: "); 
		 number=s.nextInt();
	  }
	  public void inputsize()
	  {
		  System.out.print("\n\tEnter Price: ");
		    size=s.nextFloat();
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
	  { 
		  System.out.print(destin);
	  }
	  public void outputfurniture()
	  {
		  System.out.print(number);
	  }
	  public void outputsize()
	  {
		  System.out.print(size);
	  }
	  public void outputprice()
	    {
		  System.out.print(price);
	    }
}
