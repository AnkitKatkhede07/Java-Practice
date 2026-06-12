/*Q1.Find Maximum of Two Numbers
Write a function findMax(int a, int b) that returns the maximum of two numbers.
Call this function in main() and print the result.*/
public class MaxFuncation
{
public static void main(String []args)
{
   int num1 = 50, num2 = 100;
   int result = findMax(num1, num2); // calling function
   System.out.println("The maximum number is: " + result);
}
public static int findMax(int a,int b)
{
if(a>b)
{
  System.out.println("a is Max");
  return a;
}
else
{
  System.out.println("b is Max");
  return b;
} 
} 
}