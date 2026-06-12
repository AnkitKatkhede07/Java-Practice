public class ReverseNum
{
 public static void main(String x[])
 {
   int num=123;
   int sum=0;
   sum=sum+(num%10)*100;
   num=num/10;
   sum=sum+(num%10)*10;
   num=num/10;
   sum=sum+(num%10)*1;
   num=num/10;
   System.out.println(+num);
 }
}