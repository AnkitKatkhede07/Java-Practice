//Q19. Write a java program to find the prime number of an array.
import java.util.Scanner;
public class PrimeArray
 {
  public static void main(String []args)
    {
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter array size");
	  int s=sc.nextInt();
	  int arr[]=new int[s];
	  System.out.println("Enter array element:");
	  for(int i=0;i<arr.length;i++)
	  {
	    arr[i]=sc.nextInt(); 
	  }
	    boolean flag=false;
		System.out.println("Prime numbers in the array:");
	  for(int i=0;i<arr.length;i++)
	  { 
       if (arr[i] <= 1)
		   {
            flag=true;
         }
	   else if(arr[i]%2==0)
	  {
		  flag=true;
	     //System.out.print("is not prime number");
	  }
	  else
	  {
		  System.out.println("is prime number:"+arr[i]);
	  }
	  }
    }
  }
  /*
   System.out.println("Prime numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
  */