//4. Write a program to input numbers and print its table?
import java.util.Scanner;
public class Table
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Number from User:");
  int no=sc.nextInt();
  int i=1;
  int num=10;
  while(i<=num)
  {
	  int tab;
      tab=i*no;
	  i++;
	System.out.println(+tab);
  }
}
}