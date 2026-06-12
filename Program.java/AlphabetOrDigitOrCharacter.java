//.Q Write a java program to input any character and check whether it is alphabet, digit or special character.
import java.util.*;
public class AlphabetOrDigitOrCharacter
{
 public static void main(String x[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a character");
   char ch=sc.nextLine().charAt(0); 
   String abc=((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))?
   "It is alphabet":(ch >= '0' && ch <= '9')?"It is digit":" Is a Special Character";
  System.out.println(abc);
 }
}