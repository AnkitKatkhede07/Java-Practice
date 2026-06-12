public class HappyNO
{
 public static void main (String args[])
 {
   int n=4;
   int temp=n;

    while (temp != 1 && temp != 4) {   // 4 means loop
            int sum = 0;
   while(temp>0)
   {
      int digit=temp%10;
	   sum=sum+(digit*digit);
	   temp=temp/10;  
   } temp=sum;
  }
   if(temp==1)
   System.out.println("number is found : "+temp);
   else
  System.out.println("number is not found : "+temp);

 }
}