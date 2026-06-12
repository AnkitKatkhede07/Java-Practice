/*Simple Calculator using Functions
Write separate functions:
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b)
Call them based on user choice.*/
import java.util.*;
public class Separate
{
public static int Numadd(int a, int b)
{
  return a+b;
 }
 
public static int subtract(int a,int b)
{	 
   return a-b;
}
public static int multiply(int a, int b)
{	  
 return a*b;
}
public static int divide(int a, int b)
{	  
 if (b == 0)
	 {
   System.out.println("Error: Division by zero not allowed!");
   return 0;
        }
 return a/b;
}

  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	 System.out.println("Simple Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
    System.out.println("Enter Number of A:");
	int a=sc.nextInt();
	System.out.println("Enter Number of B:");
	int b=sc.nextInt();
switch(choice)
{
	case 1:
	Numadd(a,b);
	System.out.println(a+b);
	break;
	case 2:
	subtract(a,b);
	System.out.println(a-b);
	break;
	case 3:
	multiply(a,b);
	System.out.println(a*b);
	break;
	case 4:
	divide(a,b);
	System.out.println(a/b);
	break;
	default:
       System.out.println("Invalid choice!");
	   return;
	
  }
  }
}
