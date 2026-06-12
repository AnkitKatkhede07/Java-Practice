/*Q52: Create a Java program to simulate a simple calculator using a switch case. 
It should take two numbers and an operator (+, -, *, /, %) 
as input and perform the corresponding operation.
Explanation:
Use a switch on the operator to handle different arithmetic operations.
 Add default to handle invalid operators.*/
 import java.util.Scanner;
 public class SimulateCal
 {
   public static void main(String[]args)
   {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a tow numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum=0;
	System.out.println(" Input an operator (+, -, *, /, %) :");
	char Input=sc.next().charAt(0);
	switch(Input)
	{
	case '+':
	// a=sc.nextInt();
	 //b=sc.nextInt();
	 //sum=a+b;
	System.out.println("Add:"+(a+b));
	break;
	case '-':
	sum=a-b;
	System.out.println("sub:"+(a-b));
	break;
	case '*': 
	 sum=a*b;
	System.out.println("Mul:"+(a*b));
	break;
	case '/':
	 sum=a/b;
	System.out.println("division:"+(a/b));
	break;
	case '%':
	 sum=a%b;
	System.out.println("mod:"+(a%b));
	break;
	default :
	System.out.println(" invaild an operator (+, -, *, /, %) ");
	}
   }
 }
