//Write a java program to find the total number of notes in a given amount.  
                    	
            //Enter the amount: 2528
//Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1
import java.util.*;
public class FindAmount
{
 public static void main(String x[])
 {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a amount");
	int amount=sc.nextInt();
	int n500 = amount/500;
	amount=amount%500;
	
	int n100=amount/100;
	amount=amount%100;
	
	int n50=amount/50;
	amount=amount%50;
	
	int n20=amount/20;
	amount=amount%20;
	
	int n10=amount/10;
	amount=amount%10;
	
	int n5=amount/5;
	amount=amount%5;
	
	int n2 = amount/2;
	amount=amount%2;
	
	int n1=amount;
	
	System.out.println("500 ="+n500);
	System.out.println("100 ="+n100);
	System.out.println("50 ="+n50);
	System.out.println("20 ="+n20);
	System.out.println("10 ="+n10);
	System.out.println("5 ="+n5);
	System.out.println("2 ="+n2);
	System.out.println("1 ="+n1);
	
 }
}
