public class Large
{
public static void main(String x[])
{
int num[]={1,2,6,3,5};
System.out.println("largest value is :"+getlargest(num));
}
public static int getlargest(int num[])
{
 int largest=Integer.MIN_VALUE;
  for(int i=0;i<num.length;i++)
  {
   if(largest<num[i])
   {
    largest=num[i];
   }
  }
  return largest;
}
}
