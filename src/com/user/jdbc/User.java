package com.user.jdbc;
import java.util.*;

public class User {
	 protected int userId;
	 protected String pass;
	  Scanner s=new Scanner(System.in);
	  public User()
	  { };
	  public User(int userId,String pass)
	  {
	    userId=this.userId;
	    pass=this.pass;
	  }
	  public void getData()
	  { 
		  System.out.println("Enter Userid: ");
		  userId=s.nextInt();
		  System.out.println("Enter Password: ");
		  pass=s.next();
		  
	  }
	  public void displaydata()
	  {
		  System.out.print("\n\tUserId: "+userId);
		    System.out.print("\n\tPass: ");
		    int l;
		    for(l=0;l<pass.length();l++)
		    {
		      System.out.print("*");
		    }
		    System.out.println();
		  }
	  }
	  
