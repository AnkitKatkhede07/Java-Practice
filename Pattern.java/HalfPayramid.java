//half pyramid
public class HalfPayramid
{
 public static void main(String[]args)
 {
   for(int i=1;i<=5;i++)
   {
     for(int j=1;j<=5;j++)
	 {
	   if(j<=i)
	    System.out.printf("%d",j);
	   else 
	   System.out.print("");
	 }
	   System.out.println("\n");
	 }
   }
   
 }
