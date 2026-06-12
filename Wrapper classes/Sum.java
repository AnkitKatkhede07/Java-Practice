/*  Q41. Write a program to enter the String and sum of the all Digits in a given String
   input : abcd123pqe12mn12abc
   output is  Sum is  147
   (note  sum of number is 123+12+12 =147)
*/
public class Sum
{
  public static void main(String args[])
  {
     String  str="abcd123pqe12mn12abc";
	 int sum=0;
	 int num=0;
	 for(int i=0;i<str.length();i++)
	 {
	   if(str.charAt(i)>=48 && str.charAt(i)<=57)
	   {
	      num=str.charAt(i);
		 
	   }
	   sum+=num;
	 }System.out.println(sum);
  }
}