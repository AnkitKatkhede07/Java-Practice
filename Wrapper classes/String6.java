/* Q6. Write a program to reverse a given string.
 Input : Java
 Output : avaJ
*/
public class String6
{
  public static void main(String args[])
  {
     String str="Java";
	 String ch=" ";
	 for(int i=str.length()-1;i>=0;i--)
	 {
	     ch+=str.charAt(i);
		
	 }System.out.println(ch);
  }
}