/* 1. Write a program to reverse a string without using built-in reverse methods. */
public class reverse
{
 public static void main (String args[])
 {
    String s="Java";
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--)
	{
	   rev+=s.charAt(i);
	}
	System.out.println(rev);
 }
}