/*Q4. Write a Java program to accept marks of 3 subjects and find the grade using if-else if ladder:
90–100: A
80–89: B
70–79: C
Below 70: Fail
*/
import java.util.*;
public class Grade
{
 public static void main(String args[])
{
  int m1=Integer.parseInt(args[0]);
int m2=Integer.parseInt(args[1]);
int m3=Integer.parseInt(args[2]);
int sum=m1+m2+m3;
int marks=sum/3;

 if(marks>=90&&marks<=100)
{
  System.out.println("A");
}
else if(marks>=80&&marks<=89)
{
   System.out.println("B");

}
else if(marks>=70&&marks<=79)
{
   System.out.println("C");
}
else
{
   System.out.println("D");

}
}
}