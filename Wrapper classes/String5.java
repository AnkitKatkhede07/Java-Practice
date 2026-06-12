/* Q5. Write a program to count consonants in a string.
 Input: Computer
 Output: 5 */
public class String5
{
  public static void main (String[]args)
  {
     String S="Computer";
	 int count=0;
	 for(int i=0;i<S.length();i++)
	 {char ch=S.charAt(i);
		 if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	    
	   if(!(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
	   {
	     count++;
	   }
	   
	  }
	 }System.out.println(count);
  }
}