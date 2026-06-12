//Write a java program to print all natural numbers from 1 to n. using while loop
import java.util.*;
public class NaturalNum
{
  public static void main(String X[])
  {
  int num,i;
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number in keybord");
	num=sc.nextInt();
	i=0;
	while(i<num)
	{
	System.out.println(i);
	i++;
	}
  }
  
}