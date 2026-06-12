//Q3. Write a java program to check number Is armstrong number or not armstrong using function.
import java.util.Scanner;
public class CheckNum
{
  public static void main (String args[])
  {
   Scanner sc= new Scanner (System.in);//input class
   System.out.println("Enter a Three Number from User");
    int no=sc.nextInt(); 
     checkNum(no);
    }
 public static void checkNum(int no)
{
int sum=0;int temp=no;

     while(no!=0)//loop for check number of Intration
     {

        int digit=no%10;
        sum+=digit*digit*digit;//this codition baisc for User input
        no=no/10;
 
     }
      if(temp==sum)//comper
      {
        System.out.println("Number is Armstrong");
      }
      else
        {
          System.out.println("Number is Not Armstrong");
        }
     }

  
}