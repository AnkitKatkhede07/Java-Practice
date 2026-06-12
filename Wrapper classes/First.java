/* Write a program to print the first character of a string.
 Input : Apple
 Output : A
*/
public class First
{
  public static void main(String args[])
  {
	    String str="Apple";
     /* for(int i=0;i<str.length();i++)
	 {
	    if(str.charAt(i) == str.charAt(0))
		{
		   System.out.println(str.charAt(i));
		}
	 } */
	 char first=str.charAt(0);
	 System.out.println(first);
  }
}