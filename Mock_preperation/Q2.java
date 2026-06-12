/* Q2. Write a java program to print this pattern. 
 
A             A 
A B         B A 
A B C     C B A 
A B C D D C B A 
A B C     C B A 
A B        B  A 
A             A */
import java.util.*;
public class Q2{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number:");
   int n=sc.nextInt();
   pattern(n);
 }
 
public static void pattern(int no)
{  char ch='A';
	 for(char i=ch;i<=no;i++)
	 {
		  for(char j=ch;j<=i;j++)
		  {
			   
			   System.out.print(i);
			   if(ch<i)
			   {
			      ch=ch+'1';
			   }				   
		  }
	 }System.out.println();
    
}
}