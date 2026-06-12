/*Q16. Write a program to remove all spaces from a string.
 Input : Java Programming
 Output : JavaProgramming
*/
public class Remove
{
 public static void main(String args[])
 {
    String str="Java Programming";
	String result="";
	for(int i=0;i<str.length();i++)
	{
	   if(str.charAt(i)!= ' ')
	   {
	     result+=str.charAt(i);
	   }
	} System.out.println(result);
 }
}