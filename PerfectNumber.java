//Q20. Write a java program to find the perfect number of an array.
import java.util.Scanner;
public class PerfectNumber
{
 public static void main(String []args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a size of array");
  int s=sc.nextInt();
  int arr[]=new int[s];
  System.out.println("Enter a array element");
  for(int i=0;i<arr.length;i++)
   {
    arr[i]=sc.nextInt();
   }
   System.out.println("Perfect numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (isPerfect(arr[i])) {
                System.out.println(arr[i] + " is a Perfect Number");
            }
        }
    }

    public static boolean isPerfect(int num) 
	{
        if (num <= 1) {
            return false;
        }
        int sum = 0;
        for (int j = 1; j <= num / 2; j++) {
            if (num % j == 0) {
                sum += j;
            }
        }
        return sum == num;
    }
}