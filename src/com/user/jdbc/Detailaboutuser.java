package com.user.jdbc;
import java.util.Scanner;

public class Detailaboutuser extends User {
private int age;
private String nID;
private String p_number;
private String emailId;
Scanner l=new Scanner(System.in);
public Detailaboutuser()
{ }
public Detailaboutuser(int userId,String pass,int age,String nID,String p_number,String emailId)
{
	super(userId,pass);
    age=this.age;
    nID=this.nID;
    p_number=this.p_number;
    emailId=this.emailId;
}
public void getData()
{
  super.getData();
  System.out.print("\nEnter age: ");
  age=l.nextInt();
  System.out.print("\nEnter NID: ");
  nID=l.nextLine();
  System.out.print("\nEnter Phone_number: ");
  p_number=l.nextLine();
  System.out.print("\nEnter emailID: ");
  emailId=l.nextLine();
}
public void displayData()
{
  super.displaydata();
  System.out.print("\n\tAge: "+age);
  System.out.print("\n\tNID: "+nID);
  System.out.print("\n\tPhone_number: "+p_number);
  System.out.print("\n\tEmailId: "+emailId);
}
}
