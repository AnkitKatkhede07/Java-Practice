public class String2
{
 public static void main (String args[])
 {
    String x="Abhi";
	System.out.println(x.hashCode());
	String y=new String("Abhi");
	System.out.println(y.hashCode());
	System.out.println(x==y);
	/* try{
	Thread.sleep(5000);
	}
	catch(Exception ex)
	{
	  System.out.println(ex);
	} */
	
	System.out.println(x.equals(y));
	y=y.intern();
	System.out.println(y.hashCode());

	System.out.println(x==y);
		System.out.println(y.hashCode());
	
	
	String a="Ankit";
	String b="Ankit";
	System.out.println(a==b);
	System.out.println(b.hashCode());
	
             System.out.println(a.equals(b));
 }
 }
 //use String litteral than itvis part String constant pool than new String is also its created new object
but intern() method connect each other that so use that String. 
 //String is part java.lang package....