/* Q2. Write a program to find the length of a string.
 Input : Programming
 Output : 11
*/
public class String2
{
   public static void main (String args[])
   {
      String str="Programming";
	  int count=0;
	  for(int i=0;i<str.length();i++)
	  {
	    count++;
	  }
	  System.out.println(count);
   }
}