/*Q4. Write a menu-driven program using switch and do-while to perform operations on a single number:
1.Count the number of digits
2.Count how many digits are even
3.Find the product of all odd digits
4.Check if the number is an Armstrong number
5.Exit the program*/
import java.util.Scanner;
public class DigitOperation
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number from user:");
	int num=sc.nextInt();
	int choice;
	do{
	    System.out.println("A menu-driven is switch case.....");
	    System.out.println("1:Count the number of digits");
	    System.out.println("2:Count how many digits are even");
	    System.out.println("3:Find the product of all odd digits");
	    System.out.println("4:Check if the number is an Armstrong number");
	    System.out.println("5:Exit the program");
		System.out.println("choice case from user.....");
		choice=sc.nextInt();
		switch(choice)
		{
		   case 1:
		   int count=0;
		   int i=1;
		   int n = num;
		   while(n !=0)
		   {
			   count++;
			   int digit =n%10;
			   n=n/10;
		   }System.out.println("Number of digit count is:"+count);
		   break;
		   case 2:
		   System.out.println("num : " + num);
		    i=2;
			int no=num;
		   count=0;
		   while(no !=0)
		   {
			   count++;
			   int digit =no%10;
			   no=no/10;
			 if(count%i==0)  
			 {
				System.out.println("Even number:"+count); 
			 }
			 else{
			 System.out.println("no even number present");
			 }
		   }
		   break;
		   case 3:
		   System.out.println("num : " + num);
		   int number=num;
		   int product=1;
		   boolean foundOdd=false;
		   while(number>0)
		   {
			   int digit = number%10;//get last number
			   if(digit%2==1)
			   {
			    product=product*digit;
				foundOdd=true;
			   } 
			   number=number/10;//remove a last number
		   }
		   if(foundOdd){
			   System.out.println("product of odd num is:"+num+"="+product);
		   }
		   else
		   {
               System.out.println("No odd digits found.......");
		   }
		   continue;
		   case 4:
		   int temp=num;
		   
		   int a=String.valueOf(num).length();//count number of digit
		   int sum=0;
		   while(temp>0){
		   int d=temp%10;
		   sum+=Math.pow(d,a);
		   //add power
		   temp=temp/10;//remove a last digit
		   }
		   if(sum==num)
		   {
			   System.out.println("Number is Amstrong number"+num+"="+sum);
		   }
		   else
		   {
			   System.out.println("Number is not Amstrong"+num+"="+sum);
		   }
		   continue;
		   case 5:
		   System.out.println("Thank you for and Exit the program........");
		   break;
		   default:
		   System.out.println("Enter a correct case number plz try reapet case number........")
		
		}
	
	  }while(choice !=5);
  }
}

