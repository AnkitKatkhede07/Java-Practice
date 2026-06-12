//Find max and Min
import java.util.*;
public class ArrayList5
{
   public static void main(String args[])
   {
      ArrayList <Integer>al=new ArrayList<>();
	  al.add(30);
	  al.add(19);
	  al.add(84);
	  al.add(74);
	  al.add(54);
	  al.add(73);
	  int max=al.get(0);
	   int min=al.get(0);
	   for(int i=0;i<al.size();i++)
	   {
		   if(al.get(i)>max)
		   {
		    max=al.get(i);
	      }
		  
		  if(al.get(i)<min)
		  {
			 min=al.get(i);
		  }
	   
	   
	   }System.out.println(max); 
	   System.out.println(min);  
	   
   }
}