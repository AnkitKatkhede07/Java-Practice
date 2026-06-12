/*Q1. Task: For a number n, calculate: 
   Sum of digits at even places (from right) 
   Sum of digits at odd places (from right) 
   Finally print the difference of these sums. 
   Example: n = 572631 → even places sum = 7+6+1 = 14,  
odd places sum = 5+2+3 = 10 → difference = 4.*///136275
/*import java.util.Scanner;
public class Calculate
{
  public static void main(String []args)
  {
   Scanner sc = new Scanner(System.in);
   int num=572631;
   int sum=0;
   while(num!=0)
   {
	    int digit=num%10;
		if(digit%2==0)
		{
			 sum=sum+digit;
			 num=num/10;
			System.out.println("Even number sum is");
		}
   }
}
}*/
//-------------------------------------------------------
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int oddSum = 0, evenSum = 0;
        int position = 1; // Position counter (1 = rightmost digit)

        while (num != 0) {
            int digit = num % 10;

            if (position % 2 == 0) {  // even place
                evenSum += digit;
            } else {                  // odd place
                oddSum += digit;
            }

            num /= 10;
            position++;
        }

        int difference = Math.abs(evenSum - oddSum);

        System.out.println("Sum of digits at even places: " + evenSum);
        System.out.println("Sum of digits at odd places: " + oddSum);
        System.out.println("Difference: " + difference);
    }
}
