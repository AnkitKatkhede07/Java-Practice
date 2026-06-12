public class HafInt
{
 public static void main(String x[])
 {
	 //int n=6;
  for(int i=1;i<=6;i++)
  {
   for(int j=1;j<=6;j++)
   if(i==1||j==1||j==7-i)
   {
    System.out.print("*");
   }
   else 
   {
	   System.out.print(" ");
   }
   System.out.println("\n");
  }
 }
}
