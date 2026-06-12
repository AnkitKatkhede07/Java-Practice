/*Write a program to count digits in a string.
 Input : abc123
 Output : 3*/
 
 public class Countdigit
 {
   public static void main(String args[])
   {
      String str="a1c123bd";
	  int count=0;
	  for(int i=0;i<str.length();i++)
	  {
	    if(str.charAt(i)>=48&&str.charAt(i)<=57)
		{
		 count++;
		}
	  }System.out.println(count);
   }
 }
