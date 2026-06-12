/*Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        	    Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F	
/*/
import java.util.*;
public class MarksSystem
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a marks of Physics");
	int Physics=sc.nextInt();
    System.out.println("Enter a marks of Chemistry");
	int Chemistry=sc.nextInt();
	System.out.println("Enter a marks of Biology");
	int Biology=sc.nextInt();
	System.out.println("Enter a marks of Mathematics");
	int Mathematics=sc.nextInt();
	System.out.println("Enter a marks of Computer");
	int Computer=sc.nextInt();
	int percentage=(Physics+Chemistry+Biology+Mathematics+Computer)*100/500;
	System.out.println("this is total marks:"+percentage);
	if (percentage>=90)
	{
		System.out.println("A grade");
	}
	 else if (percentage>=80)
	{
		System.out.println("B grade");
	}
	else if (percentage>=70)
	{
		System.out.println("C grade");
	}
 else if (percentage>=60)
 {
	 System.out.println("D grade");
 }
 else if (percentage>=50)
 {
	 System.out.println("E grade");
 }
 else if (percentage>=40)
 {
	 System.out.println("F grade");
 }
 else {
 System.out.println("Rong marks");
 }
  }
}