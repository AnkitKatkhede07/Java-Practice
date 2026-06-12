//Q18. Write a java program to find the first and last digit of a number.
import java.util.*;
public class FirstAndLast
{
  public static void main(String []args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
     int lastDigit = num % 10;

        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
   
   
	}


 
