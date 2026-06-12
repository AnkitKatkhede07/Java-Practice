/*Q3. Write a java program to print this pattern. 
 
1 
2 * 2 
3 * 3 * 3 
4 * 4 * 4 * 4 
3 * 3 * 3 
2 * 2 
1
*/
public class Print
{
 public static void main(String args[])
 {
 int n=8;
   for(int i=1;i<n;i++)
   {  
     for(int j=i;j<n-3+i;j++)
	 {
		 System.out.print(i);
		 System.out.print("*");
      for(int k=i;k<n-5;k++)
      {
			 
      }
	 }System.out.println();
   } System.out.println();
 }
}