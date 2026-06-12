public class StrongNum
{
  public static void main(String args[])
  {
   int no=145;
   int temp=no;
   int sum=0;
   while(temp!=0)
   {
   int digit=temp%10;
   int f=1;
   for(int i=1;i<=digit;i++)
   {
     f=f*i;
   }
    sum+=f;
    temp=temp/10; 
   }
   if(sum==no)
   {
   System.out.println("number is strong"+sum);
   }
   else{
     System.out.println("not Strong number "+sum);
   }
   
  }
}