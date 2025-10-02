//Q22. Write a java program to find a strong number of an array.
import java.util.Scanner;
public class StrongArray
{
 public static void main(String []args)
 {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a array size:");
   int s=sc.nextInt();
   int arr[]=new int[s];
   System.out.println("Enter a arrya of element");
   for(int i=0;i<arr.length;i++)
   {
     arr[i]=sc.nextInt();
   }
   System.out.println("Is all number is Strong Number:");
   for(int i=0;i<arr.length;i++)
   {
     if(isStrong(arr[i]))
	 {
	   System.out.println(+arr[i]);
	 }
   }
 }
	
	 public static boolean isStrong(int num)
	 {
	 int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num=num/10;
        }
        return sum == original;
    } // Method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
   }


