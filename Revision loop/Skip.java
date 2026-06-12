import java.util.*;
/*public class Skip
{
public static void main(String x[])
{
   Scanner sc = new Scanner(System.in);
    int i=1;
   do{
   if(i==4)
   {
	   i++;
   continue;
   }
   if(i==7)
   {
   break;
   }System.out.println(i); 
   i++;
   }while(i<=10);
}
}*/
public class Skip{
public static void main(String x[])
{
	for(int i=1;i<=10;i++)
	{
		if(i==6)
		{
	       continue;
		}System.out.println(i);
	}
}}