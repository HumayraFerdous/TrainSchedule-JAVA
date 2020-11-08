package com.main;
import java.sql.*;
import java.util.Scanner;
import java.io.*;
import trainschedule.Admin;
//import trainschedule.Testsetw;

public class myproject {

	private static Scanner s;
	private static DataInputStream in;
	
	public static void main(String[] args) {
		setIn(new DataInputStream(System.in));
		s = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(  
	        "jdbc:mysql://localhost:3306/login","root",null); 
	        Statement stmt=con.createStatement();
			Connection con1=DriverManager.getConnection(  
		     "jdbc:mysql://localhost:3306/passengerdetail","root",null); 
		    Statement stmt1=con1.createStatement();
		    Connection con2=DriverManager.getConnection(  
		    "jdbc:mysql://localhost:3306/transportdetail","root",null); 
			Statement stmt2=con2.createStatement();
            
			 System.out.print("\n           WELCOME TO TRAIN SCHEDULE OF KAMLAPUR RAILWAY STATION      \n");
			    System.out.print("          --------------------------------------------------------    \n\n");
			    int choose1,choose2,choose6,chois;
			    char c = 0;
			    int option = 0;
			    //Testsetw st=new Testsetw();
			    Admin a1=new Admin("123456");
			    Admin a2=new Admin();
			    do
			    {
			        System.out.print("\n******** Main Menu *******\n\n");
			        System.out.print("\t1.Admin-mode\n");
			        System.out.print("\t2.User-mode\n");
			        System.out.print("\t3.Exit\n");
			        System.out.print("\n**************************\n");
			        System.out.print("\nEnter your choice: ");
			        choose1=s.nextInt();
			        if(choose1==1)
			        {
			        	System.out.println();
			        	a2.getId();
			        	a2.displayId();
			        	int i=a1.compto(a2);
			            if(i==0)
			              { 
			            	System.out.print("\n    ----------------");
			                System.out.print("\n\tLogged in");
			                System.out.print("\n    ----------------\n\n");
			                do
			                {
								 String name1,name2,off1,off2,destin1,destin2,type1,sql;
								 int number,id1,id2;
								 double price1,price2,size;
								 ResultSet rs1=null;
								 ResultSet rs2=null;
			                	 System.out.print("\n........ADMINISTRATOR MENU......\n\n");
			                     System.out.print("\t1.Insert\n");
			                     System.out.print("\t2.Update\n");
			                     System.out.print("\t3.Delete\n");
			                     System.out.print("\t4.Display\n");
			                     System.out.print("\t5.Exit\n");
			                     System.out.print("\n.................................\n");
			                     System.out.print("\n\tAdmin choice: ");
			                     choose6=s.nextInt();
			                     switch(choose6)
			                     {
			                     case 1:
			                     {
			                    	System.out.print("\n\tInsert into which category?\n");
			                        System.out.print("\tp for Passenger and m for Mail train: ");
			                        c=(char)System.in.read();
			                        if(c=='p')
			                        {
			                        	System.out.print("\n\nEnter TrainId: ");
			                        	id1=s.nextInt();
			                        	System.out.print("Enter TrainName: ");
			                        	name1=s.next();
			                        	System.out.print("Enter Offday: ");
			                             off1=s.next();
			                        	System.out.print("Enter Destination: ");
			                        	destin1=s.next();
			                        	System.out.print("Enter Type: ");
			                        	type1=s.next();
			                        	System.out.print("Enter Price: ");
			                             price1=s.nextDouble();
			                        	stmt1.executeUpdate("insert into detailofpassengertrain values('"+id1+"','"+name1+"','"+off1+"','"+destin1+"','"+type1+"','"+price1+"')");
			                        	System.out.println("\n\tINSERTION COMPLETED AT PASSENGER TRAIN\n\n");
			                        	
			                        }
			                        else if(c=='m')
			                        {
			                        	System.out.print("\n\nEnter TrainId: ");
			                        	id2=s.nextInt();
			                        	System.out.print("Enter TrainName: ");
			                        	name2=s.next();
			                        	System.out.print("Enter Offday: ");
			                        	off2=s.next();
			                        	System.out.print("Enter Destination: ");
			                        	destin2=s.next();
			                        	System.out.print("Enter Number of furniture: ");
			                        	number=s.nextInt();
			                        	System.out.print("Enter Size of furniture: ");
			                        	size=s.nextDouble();
			                        	System.out.print("Enter Price: ");
			                        	price2=s.nextDouble();
			                        	stmt2.executeUpdate("insert into detailoftransportrtrain values('"+id2+"','"+name2+"','"+off2+"','"+destin2+"','"+number+"','"+size+"','"+price2+"')");
			                        	System.out.println("\n\tINSERTION COMPLETED AT TRANSPORT TRAIN\n\n");
			                        }
			                     }
			                     break;
			                     case 2:
			                     {
			                    	 System.out.print("\n\tUpdate to which category?\n");
				                     System.out.print("\tp for Passenger and m for Mail train: ");
				                     c=(char)System.in.read();
				                        if(c=='p')
				                        { 
				                        	System.out.print("\nEnter IdNumber to Update: ");
			             			id1=s.nextInt();
			             			System.out.print("Enter Updated Price: ");
			             			price1=s.nextDouble();
			             		    sql="update detailofpassengertrain "+" set Price="+price1+" where IdNumber="+id1;
			             			stmt1.executeUpdate(sql);
			             			sql="select * from  detailofpassengertrain "+"where IdNumber="+id1;
			             			rs1=stmt1.executeQuery(sql);
			             			System.out.print("\n\nIdNumber    Name       Offday     Destination   Type    Price\n\n");
			             			while(rs1.next())
			             			{
			             				id1=rs1.getInt("IdNumber");
			             				name1=rs1.getString("Name");
			             				off1=rs1.getString("Offday");
			             				destin1=rs1.getString("Destination");
			             				type1=rs1.getString("Type");
			             				price1=rs1.getDouble("Price");
			             				System.out.println("  "+id1+"        "+name1+"    "+off1+"     "+destin1+"          "+type1+"      "+price1);
			             			}
			             			System.out.println("\n\tUPDATE IS COMPLETED AT PASSENGER TRAIN\n\n");
				                        }
				                        else if(c=='m')
				                        {
				                        	System.out.print("\nEnter IdNumber to Update: ");
					             			id2=s.nextInt();
					             			System.out.print("Enter Updated Price: ");
					             			price2=s.nextDouble();
					             		    sql="update detailoftransportrtrain "+" set Price="+price2+" where IdNumber="+id2;
					             			stmt2.executeUpdate(sql);
					             			sql="select * from  detailoftransportrtrain "+"where IdNumber="+id2;
					             			rs2=stmt2.executeQuery(sql);
					             			System.out.print("\n\nIdNumber    Name          Offday     Destination     Number       Size     Price\n\n");
					             			while(rs2.next())
					             			{
					             				id2=rs2.getInt("IdNumber");
					             				name2=rs2.getString("Name");
					             				off2=rs2.getString("Offday");
					             				destin2=rs2.getString("Destination");
					             				number=rs2.getInt("Number");
					             				size=rs2.getDouble("Size");
					             				price2=rs2.getDouble("Price");
					             				System.out.println("  "+id2+"        "+name2+"    "+off2+"     "+destin2+"             "+number+"          "+size+"    "+price2);
					             			}
					             			System.out.println("\n\tUPDATE IS COMPLETED AT TRANSPORT TRAIN\n\n");
				                        }
			                     }
			                    	 
			                       break; 
			                     case 3:
			                     {
			                    	 System.out.print("\n\tDelete from which category?\n");
				                     System.out.print("\tp for Passenger and m for Mail train: ");
				                     c=(char)System.in.read();
				                        if(c=='p')
			                    	{
				                    System.out.println("\nEnter Idnumber to be Deleted: ");
			             			id1=s.nextInt();
			             			sql="delete from detailofpassengertrain where IdNumber="+id1;
			             			stmt1.executeUpdate(sql);
			             			System.out.println("\n\tDELETION COMPLETED AT PASSENGER TRAIN\n\n");
			                    	}
				                    else if(c=='m')
				                    	{
					                    System.out.println("\nEnter Idnumber to be Deleted: ");
				             			id2=s.nextInt();
				             			sql="delete from detailoftransportrtrain where IdNumber="+id2;
				             			stmt2.executeUpdate(sql);
				             			System.out.println("\n\tDELETION COMPLETED AT TRANSPORT TRAIN\n\n");
				                    	}
			                     }
			                     break;
			                     case 4:
			                     {
			                    	 int j=0;
			                    	 System.out.print("\n\tDisplay to which category?\n");
				                     System.out.print("\tp for Passenger and m for Mail train: ");
				                     c=(char)System.in.read();
				                     if(c=='p')
				                     {
				                    	sql="select * from detailofpassengertrain ";
				             			rs1=stmt1.executeQuery(sql);
				             			System.out.println("\n\n\tDISPLAYING FULL INFORMATION\n\n");
				             			System.out.print("\n\n");
				             			while(rs1.next())
				             			{
				             				j++;
				             				System.out.println("\tTrain: "+j);
				             				System.out.println("\tIdNumber: "+rs1.getInt(1));
				             				System.out.println("\tName: "+rs1.getString(2));
				             				System.out.println("\tOffday: "+rs1.getString(3));
				             				System.out.println("\tDestination: "+rs1.getString(4));
				             				System.out.println("\tType: "+rs1.getString(5));
				             				System.out.println("\tPrice: "+rs1.getString(6));
				             				System.out.println("\n\n");
				             			}
				                    	 
				                     }
				                     else if(c=='m')
				                     {
				                    	 int k=0;
				                    	 sql="select * from detailoftransportrtrain ";
				             			rs2=stmt2.executeQuery(sql);
				             			System.out.println("\n\n\tDISPLAYING FULL INFORMATION\n\n");
				             			System.out.print("\n\n");
				             			while(rs2.next())
				             			{
				             				k++;
				             				System.out.println("\tTrain: "+k);
				             				System.out.println("\tIdNumber: "+rs2.getInt(1));
				             				System.out.println("\tName: "+rs2.getString(2));
				             				System.out.println("\tOffday: "+rs2.getString(3));
				             				System.out.println("\tDestination: "+rs2.getString(4));
				             				System.out.println("\tNumber: "+rs2.getString(5));
				             				System.out.println("\tSize: "+rs2.getString(6));
				             				System.out.println("\tPrice: "+rs2.getString(7));
				             				System.out.println("\n\n");
				             				
				             			}
				                     }
			                     }
			                     break;
			                     }
			                     System.out.println();
			                     if(choose6<5)
			                     {
			                    	 System.out.print("\n\tDo you want to visit more?"+"\n\t1 for Yes"+" 2 for No: ");
			                    	 option=s.nextInt();
			                     }
			                     else if(choose6==5){
			                    	 System.out.print("\n      -------------");
			                         System.out.print("\n\tLogged out");
			                         System.out.print("\n      -------------\n");
			                     }
			                }
			                while(option==1 && choose6<5);
			            
			              }
			            else 
			            {
			            	System.out.print("\n    -------------------------------");
			                System.out.print("\n\tOOPS!!! "+"Wrong password!!!");
			                System.out.print("\n    -------------------------------\n\n");
			            }
			        }
			        else if(choose1==2)
			        {
			        	
			        	       ResultSet rs=null;
			        	       ResultSet rs1=null;
			        	       ResultSet rs2=null;
			        	       int u,p,age;
			        	       String n,Nid,P_number,emailId;
			        	       String sql;
			        		  do{
			        		    System.out.print("\n\n........USER MODE...........\n\n");
			                    System.out.print("\t1.Login with user id\n");
			                    System.out.print("\t2.Create new id\n");
			                    System.out.print("\t3.Exit\n");
			                    System.out.print("\n............................\n");
			                    System.out.print("\nUser choice: ");
			                    choose2=s.nextInt();
			                    
			                    
			         if(choose2==1)
			        	{
			            System.out.print("\n\nEnter userId: ");
						u =s.nextInt();
						System.out.print("Enter UserName: ");
						n=s.next();
						System.out.print("Enter Password: ");
						p =s.nextInt();
						rs=stmt.executeQuery("select name,pass from logme where Id="+u);
						while(rs.next())
						{
							if((n.equals(rs.getString("name"))) && (p==(rs.getInt("pass"))))
							{
								 System.out.print("\n      --------------");
		                         System.out.print("\n\tLogged in");
		                         System.out.print("\n      --------------\n");
		                         do
		                         {
								 System.out.print("\n.......Choice.......\n\n");
		                         System.out.print("\t1.Visit\n");
		                         System.out.print("\t2.Change Password\n");
		                         System.out.print("\t3.Delete Account\n");
		                         System.out.print("\t4.Return\n");
		                         System.out.print("\n....................\n");
		                         System.out.print("\n\tMake choice: ");
		                         chois=s.nextInt();
		                         switch(chois)
		                         {
		                         case 1:
		                         {
		                        	 System.out.print("\n\tShow which category?\n");
				                     System.out.print("\tp for Passenger and m for Mail train: ");
				                     c=(char)System.in.read();
				                     if(c=='p')
				                     {
				                    	 int h=0;
				                    	 sql="select * from detailofpassengertrain ";
					             			rs1=stmt1.executeQuery(sql);
					             			System.out.println("\n\n\tDISPLAYING FULL INFORMATION\n");
					             			System.out.print("\n\n");
					             			while(rs1.next())
					             			{
					             				h++;
					             				System.out.println("\tTrain: "+h);
					             				System.out.println("\tIdNumber: "+rs1.getInt(1));
					             				System.out.println("\tName: "+rs1.getString(2));
					             				System.out.println("\tOffday: "+rs1.getString(3));
					             				System.out.println("\tDestination: "+rs1.getString(4));
					             				System.out.println("\tType: "+rs1.getString(5));
					             				System.out.println("\tPrice: "+rs1.getString(6));
					             				System.out.println("\n\n");
					             		          
					             			}
					                    	 
				                     }
				                     else if(c=='m')
				                     {
				                    	 int f=0;
				                    	 sql="select * from detailoftransportrtrain ";
					             			rs2=stmt2.executeQuery(sql);
					             			System.out.println("\n\n\tDISPLAYING FULL INFORMATION\n");
					             			System.out.print("\n\n");
					             			while(rs2.next())
					             			{
					             				f++;
					             				System.out.println("\tTrain: "+f);
					             				System.out.println("\tIdNumber: "+rs2.getInt(1));
					             				System.out.println("\tName: "+rs2.getString(2));
					             				System.out.println("\tOffday: "+rs2.getString(3));
					             				System.out.println("\tDestination: "+rs2.getString(4));
					             				System.out.println("\tNumber: "+rs2.getString(5));
					             				System.out.println("\tSize: "+rs2.getString(6));
					             				System.out.println("\tPrice: "+rs2.getString(7));
					             				System.out.println("\n\n");
					             			}
				                     }
		                        	 
		                         }
		                         break;
		                         case 2:
		                         {
		                        	 System.out.print("\n\tUPDATING PASSWORD......");
		                        	 System.out.print("\nEnter Id: ");
		                        	 u=s.nextInt();
		                        	 System.out.print("New password: ");
		                        	 p=s.nextInt();
		                        	 sql="select * from logme ";
		                        	 rs=stmt.executeQuery(sql);
		                        	 rs.next();
		                        	 
		                        		 System.out.print("\n\tOld password was: "+rs.getInt(3));
		                        	 
		                 		    sql="update logme "+" set pass="+p+" where id="+u;
		                 			stmt.executeUpdate(sql);
		                 			sql="select * from logme "+"where id="+u;
		                 			rs=stmt.executeQuery(sql);
		                 			while(rs.next())
		                 			{
		                 				p=rs.getInt("pass");
		                 				System.out.println("\tNew password is: "+p);
		                 			}
		                 			System.out.print("\n\tPASSWORD UPDATED\n\n");
		                         }
		                         break;
		                         case 3:
		                         {
		                        	System.out.print("\n\tDELETING ACCOUNT.....\n\n");
		                        	System.out.print("\nEnter id: ");
		                 			u=s.nextInt();
		                 			sql="delete from logme where id="+u;
		                 			stmt.executeUpdate(sql);
		                 			sql="select * from student ";
		                 			rs=stmt.executeQuery(sql);
		                 			System.out.print("\n\tACCOUNT DELETED\n\n");
		                 			
		                         }
		                         break;
		                         case 4:
		                         {
		                        	 System.out.print("\n       -------------");
		                             System.out.print("\n\tLogged out");
		                             System.out.print("\n       -------------\n");
		                         }
		                         break;
		                         }
		                         System.out.print("\n\tDo you want more?"+"\n\t1 for Yes"+" 2 for No: ");
		                         option=s.nextInt();
		                         }
		                         while(option==1 && chois<4);
							}
							else
							{
								System.out.print("\n     -------------------------------------");
		                        System.out.print("\n\tSORRY!!!..."+"You are not a User!!!");
		                        System.out.print("\n     -------------------------------------\n");
							}
						
						}
			        	}
			         else if(choose2==2)
			         {
			        	 System.out.print("\n\tCreating New Id\n\n");
			        	 System.out.print("\nEnter UserId: ");
			        	 u=s.nextInt();
			        	 System.out.print("Enter Name: ");
			        	 n=s.next();
			        	 System.out.print("Enter Password: ");
			        	 p=s.nextInt();
			        	 System.out.print("Enter Age: ");
			        	 age=s.nextInt();
			        	 System.out.print("Enter National_Id_number: ");
			        	 Nid=s.next();
			        	 System.out.print("Enter Phone number: ");
			        	 P_number=s.next();
			        	 System.out.print("Enter EmailId: ");
			        	 emailId=s.next();
			        	stmt.executeUpdate("insert into logme values('"+u+"','"+n+"','"+p+"','"+age+"','"+Nid+"','"+P_number+"','"+emailId+"')");
                     	System.out.println("\n\tNew ID Creation Is Completed\n");
                     	System.out.print("\tNow login with New Id!!!!"+"\n\tThank you\n\n");
			         }
			         if(choose2<3)
			         {
			        	 System.out.print("\n\tBack to User mode?"+"\n\t1 for yes"+" 2 for No: ");
			        	 option=s.nextInt();
			         }
			         else if(choose2==3)
			         {
			        	 System.out.println("\tExit from User mode\n\n");
			         }
			        }
			        		  while(option==1 && choose2<3);
			        }
			        if(choose1<3)
			        {
			        	System.out.print("\n\tBack to Main menu?"+"\n\t1 for Yes"+" 2 for No: ");
			            option=s.nextInt();
			        }
			        else if(choose1==3)
			        {
			        	System.out.print("\n\tProgram Terminated\n\n");
			        }
			        
			        }
			    while(option==1 && choose1<3);
			    if(option==2)
		        {
		        	System.out.print("\n\tProgram Terminated\n\n");

		        }
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
			    
	}

	public static DataInputStream getIn() {
		return in;
	}

	public static void setIn(DataInputStream in) {
		myproject.in = in;
	}

}
