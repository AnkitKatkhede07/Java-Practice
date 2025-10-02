/*2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. 
Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.*/
class calculator
{
  int add(int a, int b)
  {
  return a+b;
  }
  int sub(int a, int b)
  {return a-b;
  }
  int mul(int a, int b)
  {return a*b;
  }
}
  public class ArithmaticApp{
 public static void main(String [] args)
{
   calculator cal= new calculator();  
   int num1=10, num2=20;
	  System.out.println("Addition"+cal.add(num1,num2));
	  System.out.println("subtraction"+cal.sub(num1,num2));
      System.out.println("multiply"+cal.mul(num1,num2));


}

  }