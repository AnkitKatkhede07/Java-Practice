//Q2. Write a java program to print 1 to nth Strong number.
import java.util.*;
public class Strongnum
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Number for User:");
   int num=sc.nextInt();
  for(int i=1;i<num;i++)
   { 
    int n=num*i;
     
       if(num==n)
        { 
	       System.out.println("Number is not a Strong number");
        }	
       		
     
    else
       {
	     System.out.println("Number is not a Strong number");
       } 
   }	   
 }
}
-----------------------------------------------------------
import java.util.*;

public class Strongnum {
    // Function to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is strong
    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        System.out.println("Strong numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }
    }
}
