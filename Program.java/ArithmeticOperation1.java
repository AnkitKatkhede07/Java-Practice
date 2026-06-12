import java.util.*;
public class ArithmeticOperation1
{
  public static void main(String x[])
  {
    Scanner scanner = new Scanner(System.in);
	//int num
	System.out.println("Enter first number:");
	int a = scanner.nextInt(); 
	System.out.println("Enter Secound number:");
	int b = scanner.nextInt();
	int sum;
	//ArithmaticOperation
	 sum =   a+b;
	int sum1 = a-b;
	int sum2 = a/b;
	int sum3 = a%b;
	int sum4 = a*b;
	System.out.println("Add to num:"+sum);
    System.out.println("sub to num:"+sum1);
	System.out.println("Divison to num:"+sum2);
	System.out.println("mod to num:"+sum3);
	System.out.println("mul to num:"+sum4);
	
	System.out.println("/nOutput second");
    System.out.println("add to num :"+(a+b));
	System.out.println("sub to num :"+(a-b));
    System.out.println("mul to num :"+(a*b));

	
  }
}