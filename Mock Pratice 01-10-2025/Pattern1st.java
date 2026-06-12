/*Q1. Print the following pattern?
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*/
public class Pattern1st
{
 public static void main(String args[])
 {
    for(int i=0;i<9;i++)
	{
	  for(int j=0;j<i-1;j++)
	  {
	    System.out.print("*");
	  }System.out.println();
	}
 }
}