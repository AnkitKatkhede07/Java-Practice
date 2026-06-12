import java.util.*;
public class InputProgram
{
  public static void main(String x[])
   {
      Scanner scanner =new Scanner(System.in);
      
	  //int num;
     System.out.println("Enter the integer (int):");
     int a = scanner.nextInt();
	
	//input from char
	 System.out.println("Enter a character (char):");
	 char ch = scanner.next().charAt(0);
	 
	 //input float
	 System.out.println("Enter a float (float):");
	  float f = scanner.nextFloat();
	  
	  //input double
	  System.out.println("Enter a double (double):");
	  double d = scanner.nextDouble();
	  
	  //input long
	  System.out.println("Enter a long (long):");
	  long b =scanner.nextLong();
	  
	  //outline
	  System.out.println("/nOutput:");
	  System.out.println("a:"+a+";");
	  System.out.println("ch:"+ch+";");
	  System.out.println("f:"+f+"f"+";");
      System.out.println("d:"+d+";");
      System.out.println("b:"+b+";");	  
     	 

   }
}