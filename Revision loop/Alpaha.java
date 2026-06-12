//Q3. Write a java program to print all alphabets from a to z. - using while loop
import java.util.*;
public class Alpaha
{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
  // char ch = sc.nextLinecharAt(0);
  char ch='a';
   while(ch<='z')
   {
   System.out.println(ch+" ");
   ch++;
   }
 }
}