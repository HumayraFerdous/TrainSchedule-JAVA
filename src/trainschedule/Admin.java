package trainschedule;
import java.util.*;

public class Admin {
	 protected String pass;
	  Scanner s=new Scanner(System.in);
	  public Admin()
	  { }
	  public Admin(String p)
	  {
	    pass=p;
	  }
	  public void getId()
	  {
	    System.out.print("\tEnter Password: ");
	    pass=s.nextLine();
	  }
	  public void displayId()
	  {
	    System.out.print("\n\tPassword: ");
	    int l;
	    l=pass.length();
	    for(int i=0;i<l;i++)
	    {
	      System.out.print("*");
	    }
	    System.out.println();
	  }
	  public int compto(Admin a)
	  {
	    int i=pass.compareTo(a.pass);
	   return i;
	  }
	}
