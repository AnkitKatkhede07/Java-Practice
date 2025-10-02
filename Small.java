public class Small
{
 public static void main(String x[])
 {
   int num[]={1,2,6,3,5};
   System.out.println("Smallest number is:"+getsmallest(num));
 }
 public static int getsmallest(int num[])
 {
   int samllest=Integer.MAX_VALUE;
  for(int i=0;i<num.length;i++)
  {
   if(samllest>num[i])
   {
      samllest=num[i];
   }
  }
  return samllest;
 }
}