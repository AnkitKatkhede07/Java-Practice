/*Q3.Calculate Factorial
Write a function factorial(int n) that returns the factorial of a given number.
Call it from main() and display the factorial.*/
import java.util.Scanner;
public class Factorial{
public static void main (String []args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a NUmber:");
  int num=sc.nextInt();
  int result=getNo(num);
  System.out.println("factorial is"+result); 
  
}
public static int getNo(int n)
{
   if(n==0){
   return 1;
   }
   return n*getNo(n-1);
}
}

/*
public static int getNo(int n) {
    int fact = 1;     // result
    for (int i = 1; i <= n; i++) {
        fact = fact * i;   // multiply step by step
    }
    return fact;
}*/
