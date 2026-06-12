import java.util.*;
public class Method
{
  public static void main(String args[])
  {
     ArrayList<Integer> al=new ArrayList<>();
	 al.add(10);
	 al.add(20);
	 al.add(30);
	 al[1].remove();
	  boolean  b=al.isEmpty();
	 
	 if(b)
	 {
	    System.out.println("empty");
		}
		else
	 {
	    System.out.println("is not empty");
		}
		
  }
}