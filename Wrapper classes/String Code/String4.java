public class String4
{
  public static void main (String args[])
  {
     /* String s= " "; */
	 StringBuilder s = new StringBuilder();
	 for( int i=0;i<+5;i++)
	 {
/* 	    s=s+i; */
   s.append(i);

	 }
	 System.out.println(s);
  }
}