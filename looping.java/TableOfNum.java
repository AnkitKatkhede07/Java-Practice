//Q9. Write a java program to print a multiplication table of any number.
import java.util.*;
public class TableOfNum
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int no=sc.nextInt();
   int tab;
   int i=1;
   int num=10;
   while(i<=num)
   {
     tab=i*no;
	 System.out.println(no +" X " + i + " = "+tab);
	 i++;
   }
   
   
 }
}