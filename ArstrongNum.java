//Q23. Write a java program to find the armstrong number of an array. 
import java.util.Scanner;
public class ArstrongNum
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter a size Array");
   int size=sc.nextInt();
   
   int arr[]=new int[size];
    System.out.println("Enter Element Array ");
   for(int i=0;i<size;i++)
   {
    arr[i]=sc.nextInt();
	//System.out.println(+arr[i]);
   }
   

   System.out.println("Amsrtrong number in the Array:"); 
   for (int i = 0; i < size; i++) 
   {
      if(isarmstrong(arr[i]))
	  {
	   System.out.println(arr[i]);
	  }
   }
   sc.close();
 }
   public static boolean isarmstrong(int num)
	 {
	 int original = num;
        int sum = 0;
//count number of digits
int n=String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit,n);
            num=num/10;
        }
        
  return sum==original;
	
   }
 }