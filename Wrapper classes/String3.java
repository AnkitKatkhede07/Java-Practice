/*Q3. Write a program to count total characters in a string (excluding spaces).
 Input : Java Language
 Output : 12
*/
public class String3
{
  public static void main(String args[])
  {
     String str="Java Language";
	 int count=0;
	 for(int i=0;i<str.length();i++)
	 {
		if(str.charAt(i) != ' ')
		{
	     count++;
		}
	 }
	 System.out.println(count);
  }
}