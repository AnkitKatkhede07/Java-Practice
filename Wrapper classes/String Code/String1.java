public class String1
{
  public static void main(String args[])
  {
    String str="India";
	System.out.println(str.hashCode());
	 str=null;
	System.gc();//Explicity we are calling GC */
	try{
	Thread.sleep(5000);
	}
	catch(Exception ex)
	{
	  System.out.println(ex);
	}
	String s="India";
	System.out.println(s.hashCode());
	
  }
}