import java.util.Scanner;
public class MAth
{
public static void main(String []args)
{
 Scanner sc = new Scanner(System.in);
 float num=10;
 float sum=0;
System.out.println("Enter a value of A");
int a=sc.nextfloat();
System.out.println("Enter a value of B");
int b=sc.nextfloat();
sum=a+b;
if(sum==num)
{
  System.out.println("Sum and Num is same "+sum);
}
else
{
  System.out.println("Sum and num is not equal..... "+sum);

}
}
}
char ch =sc.nextcharAt(0);