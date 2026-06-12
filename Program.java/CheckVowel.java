//Write a java program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class CheckVowel
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a alphabet:");
   char ch =sc.next().charAt(0);
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
   {
      System.out.println("This is vowel");
   }
   else
   {
     System.out.println("This is consonant");
   }
 }
}