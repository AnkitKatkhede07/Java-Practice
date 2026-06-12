/*. Write a menu-driven program in java using switch case. 
            1. input any alphabet and check whether it is vowel or consonant. 
            2.Find the max number using 3 numbers. 
 3. input any number & check number is divisible by 5 & 11. */
 import java.util.*;
 public class MenuDrive
 {
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("select");
	int select=sc.nextInt();//choice
	switch(select)
    {
	case 1:
	System.out.println("Enter a charater");
	char ch=sc.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	   System.out.println("Vowel");
	}
	else
	{
	 System.out.println("consonant");
	}
	break;
	case 2:
	System.out.println("Enter a number");
	int a,b,c;
	a=sc.nextInt();
	System.out.println("Enter a number");
	b=sc.nextInt();
	System.out.println("Enter a number");
	c=sc.nextInt();
	if(a>b&&a>c)
	{
	System.out.println("A is max");
	}
	else if(b>a&&b>c)
	{
	 System.out.println("B is max");
	}
	else
	{
	 System.out.println("C us max");
	}
	break;
	case 3:
	System.out.println("Enter a number");
	int num=sc.nextInt();
	if(num%5==0 && num%11==0)
	{
	 System.out.println("number is divisible by 5 & 11");
	}
	else
	{
	  System.out.println("number is NOT divisible by 5 & 11");
	}
	break;
	default :
     {
     System.out.println("Incorrect case");
     }
	}
  }
 }