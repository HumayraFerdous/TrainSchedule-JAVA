package trainschedule;

public class Testsetw {
	protected int i;
    protected int len;
    public Testsetw()
    { }
    public Testsetw(int i,int len)
    {
      i=this.i;
      len=this.len;
    }
    public String setw(int i,int len)
    {
    String temp="";
  for(i=0;i<len;i++)
  {
   temp+=' ';
  }
  return temp;
    }
	
}
