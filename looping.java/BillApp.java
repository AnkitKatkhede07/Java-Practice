/*Q5.Write a menu-driven program using switch and do-while to perform:
1:Enter product price and quantity, calculate total bill
2:Apply discount (10% if bill > ₹1000)
3:Calculate GST on bill amount (18%)
4:Compare final bill amount with a given value
5:Exit the program*/


import java.util.Scanner;
public class BillApp
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	int choice;
	int value=15000;
	double Bill=0.0;
	do
	{
	   System.out.println("menu-driven of choice a case of bill amount..........");
	   System.out.println("1:Enter product price and quantity, calculate total bill");
	   System.out.println("2:Apply discount (10% if bill > ₹1000)");
	   System.out.println("3:Calculate GST on bill amount (18%)");
	   System.out.println("4:Compare final bill amount with a given value");
	   System.out.println("5:Exit the program");
	   System.out.println("choice a case from user:");
	   choice=sc.nextInt();
	   
	  
	  switch(choice)
	  {
	  case 1:
	  System.out.println("Enter a amount from user");
	  double price=sc.nextDouble();
	  System.out.println("Enter a quantity:");
	  double quantity=sc.nextDouble();
	   Bill=price*quantity;
	  System.out.println("total bill amount is:"+Bill);
	  break;
	  case 2:
	  if(Bill>1000)
	  {
		  double discount=Bill*10/100;
		  Bill=Bill-discount;
		  System.out.println("amount in bill:"+discount);
		  System.out.println("amount is a Apply discount 10% in Bill:"+Bill);
	  }
	  else
	  {
		  System.out.println("Bill is less than discount so your not discount" );
	  }
	  break;
	  case 3:
	  double GST=Bill*18/100;
	  System.out.println("GST Is:"+GST);
	  Bill=Bill+GST;
	  System.out.println(" tota GST amount is :"+Bill);
	  break;
	  case 4:
	  if(Bill==value)
	  {
		  System.out.println("the Bill correct");
	  }
	  else{
	  System.out.println("the Bill amount is not correct");
	  }
	  break;
	  case 5:
	  System.out.println("Thank you and vist again...........");
	  break;
	  
	  default:
	  System.out.println("Enter correct number re enter a choice.....");
	  
	  }
	
	}while(choice !=5);
  }
}