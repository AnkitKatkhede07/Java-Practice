/*  Q9. Create a Java program to simulate a simple calculator using a switch case. 
It should take two numbers and an operator (+, -, *, /, %) as input and perform 
the corresponding operation.
*/
import java.util.*;
public class CalNum
{
 public static void main(String x[])
 {
  //int a=10;
  //int b=5;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a character(+,-,*,/,%):");
  char ch=sc.next().charAt(0);
  System.out.println("Enter a Number");
  int a=sc.nextInt();
  System.out.println("Enter a Number");
   int b=sc.nextInt();
  //System.out.println("choice");
  //int choice=sc.nextInt();
  switch(ch)
  {
   case '+':
   int add=a+b;
   System.out.println(add);
   break;
   case '-':
   int sub=a-b;
   System.out.println(sub);
   break;
   case '*':
   int mul=a*b;
   System.out.println(mul);
   break;
   case '/':
   int Div= a/b;
   System.out.println(Div);
   break;
   case '%':
   int mod=a%b;
   System.out.println(mod);
   break;
  
   default :
     System.out.println("Incorrect case");
  }
  
 }
}