/* 2. Write a program to check whether a string is a palindrome.
 A palindrome reads the same forward and backward. */
public class Palindrome
{
 public static void main(String args[])
 {
   String str="madam";
    String rev="";
   for(int i = str.length()-1;i>=0;i--)
   {
    rev+=str.charAt(i);
   }
   if(str.equals(rev))  /*  if(str.equalsIgnoreCase(rev)) */
   System.out.println("Is palindrome");
  else
	System.out.println("Is not palindrome");

 }
}