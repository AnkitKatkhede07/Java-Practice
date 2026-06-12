//1. Write a program to input two values using command line argument and perform its swapping?
public class Swapping 
{
  public static void main(String args[])
  {
     int a=Integer.parseInt(args[0]);
	 int b=Integer.parseInt(args[1]);
	 System.out.println("Enter a :");
	 System.out.println("Enter b :");
	 System.out.println("Affter swapping a:"+a+"\t b:"+b);
	 int temp=a;
	 a=b;
	 b=temp;
	 System.out.println("Before swapping a:"+a+"\t b:"+b);
	  
  }
}