/*Q2.Problem Statement:
 Write a menu-driven program using do-while and switch-case to:
1.Check if a number is prime.
2.Find the sum of digits of a number.
3.Reverse a number.
4.Exit.
Perform operations repeatedly until the user selects exit.*/

import java.util.Scanner;
class CheckNum
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	int select;
	do{
    System.out.println("Enter a 3 number to user");
     	int num =sc.nextInt();
	  System.out.println("menu-driven of case of select a");
	  System.out.println("1:Check if a number is prime");
	  System.out.println("2:Find the sum of digits of a number");
	  System.out.println("3:Reverse a number");
	  System.out.println("4:Exit");
	  System.out.println("select the number for case:");
	  select=sc.nextInt();
	  
	  switch(select)
	  {
	   case 1:
	     boolean isPrime = true;
	   if(num<= 1)
	   {
		   //boolean isPrime = true;
		  isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {    
                    isPrime = false;
                    break;
                }
			}
		}
		 if(isPrime)
			 System.out.println("Number is prime:"+num);  
	       
		   else
		   System.out.println("Number is not prime:"+num);		
	continue;
	case 2:
       int summ=0;
	   while(num>0)
	   {
		 int digits=num%10;
	      summ=summ+digits;
	      num=num/10;
	   }System.out.println("Number of digit is:"+summ);
		  continue;
  case 3://Reverse number
 int sum=0;
 sum=sum+(num%10)*100;
 num=num/10;
 sum=sum+(num%10)*10;
 num=num/10;
 sum=sum+(num%10)*1;
 num=num/10;
  System.out.println("Reverse number :"+sum);
  continue;
  case 4://exit
  //num==exit;
  System.out.println("thank you and Exit////......");
  break;
  default:
  System.out.println("invailde case number reEnter number..........");
	}
	}while(select!=4);
  
       }
    }