/*Q62. Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.Write a c program to find the max number using 2 numbers.*/
	import java.util.*;
	public class MenuDriven
	{
	public static void main(String []args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a choice");
	 int choice =sc.nextInt();
	 switch(choice )
	 {
	  case 1:
	  System.out.println("Enter a number");
	  int number=sc.nextInt();
	  if(number>0)
	  {
	  System.out.println("positive number"+number);
	  }
	  else if(number<0)
	  {	  System.out.println("negative number"+number);
	  }
	  else
	  {
	  System.out.println("zero number"+number);
	  }
	  break;
	  case 2:
	   int num=0;
	  System.out.println("Enter a number");
	     num=sc.nextInt();
	     
	   
	  if( num % 2==0)
	  {
	  System.out.println("Even number"+num);
	  }
	  else
	  {
	  System.out.println("Odd number"+num);
	  }
	  break;
	  case 3:
	  int a,b;
	 System.out.println("Enter a number A");
	 a=sc.nextInt();
	 System.out.println("Enter a number B");
	 b=sc.nextInt();
	 if(a>b)
	  {
	  System.out.println("A is max");
	  }
	  else
	  {
	  System.out.println("B is max");
	  }
	  break;
	default : 
	  System.out.println("Invalid number");
	 }
	}
  }
	
 
