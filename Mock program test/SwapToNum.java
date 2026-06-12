//2Q. Write a java program swap two number without using third variable.
import java.util.*;
public class SwapToNum
{
 public static void main(String[]args)
 {
  Scanner sc = new Scanner(System.in);
  int a=30;
  int b=20;
  //int c;
  System.out.println("A:"+a);
  System.out.println("B:"+b);
  
  a=a+b;
  b=a-b;
  a=b-a;
  System.out.println("A:"+a);
  System.out.println("B:"+b);
 }
 
}