/*Q26. Write a java program to Check Number Is Spy Number or Not.
Example :
A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     Input : 1412
     Output : Spy Number 

Explanation :
sum = (1 + 4 + 1 + 2) = 8
product = (1 * 4 * 1 * 2) = 8
since, sum == product == 8*/
import java.util.*;
public class Spy
{
  public static void main (String args[])
   {
      int no=Integer.parseInt(args[0]);
        int sum=0 ,product=1;
int temp=no;
  
       while(no!=0) 
        {
           int digit=no%10;
           sum=sum+digit;
          product=product*digit;
           no=no/10;
        }

System.out.println((sum==product?"Spy Number":"Is not spy Number"));
    }

}
