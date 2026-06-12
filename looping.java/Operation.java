/*Q3.Write a menu-driven program using switch and do-while to perform operations on a single character:
1.Check if the character is an alphabet.
2.If alphabet, check vowel or consonant.
3.If digit, check even or odd.
4.Convert uppercase to lowercase or vice versa.
5.Exit the program
*/
import java.util.Scanner;
public class Operation
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character");
	char ch = sc.next().charAt(0);
	int choice;
	do
	{
	 System.out.println("A menu-driven choice a case:");
	 System.out.println("case 1:Check if the character is an alphabet");
	 System.out.println("case 2:If alphabet, check vowel or consonant.");
	 System.out.println("case 3:If digit, check even or odd.");
	 System.out.println("case 4:Convert uppercase to lowercase or vice versa");
	 System.out.println("case 5:Exit the program");
	 System.out.println("choice Case for user in menu-driven");
	  choice=sc.nextInt();
	 switch(choice)
	 {
	 case 1:
	 if(ch>=65&&ch<=122)
	 {
	  System.out.println("this is character");
	 }
	   else
	   {
	   System.out.println("this is not character");
	   }
      continue;
	 
	 case 2:
	 if(ch>=65&&ch<=122)
	 {
	   System.out.println("this is alphabet");
	 }
	 //ch = Character.toLowerCase(ch);
	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	 {
	    System.out.println(" Is vowel ");
	 }
	 else 
	 {
	   System.out.println("Is consonant");
	 }
    
	continue;
	case 3://digit
	System.out.println("Enter a digit for user:");
	int num=sc.nextInt();
	 if(num!=ch)
	 {
	 System.out.println("this is digit");
	 }
	 if(num%2==0)
	 {
		 System.out.println("Is Even Number:");
	 }
	 else
	 {
		 System.out.println("is odd number");
	 }
	continue; 
	 case 4:
	 if(ch>65&&ch<97)
	 {
		 System.out.println("this is uppercase.....");
	 }
	 else
	 {
		 System.out.println("This is lowercase......");
	 }
	 continue;
	 case 5:
	 System.out.println("Thank you and exit..........!");
	 break;
	 }
	}while(choice !=5);
  }
}
 

