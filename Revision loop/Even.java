//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop
import java.util.*;
public class Even
{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a numbers");
 int num=sc.nextInt();
 int i=1;
 while(i<=num)
 {
  if(i%2==0){
    System.out.println(i);
}i++;
 }
}
}