import java.util.*;
public class APP
{
  public static void main(String args[])
{int n=5;

 for(int row=1;row<=n;row++)
{
   
for(int col=row;col<=n;col++)
{
 System.out.print("*");
}System.out.println();
}
//***************************************
for(int row=1;row<=n;row++)
{
   
for(int col=1;col<=row;col++)
{
 System.out.print("*");
}System.out.println();
}
//*********************************************************
for(int i=1;i<=n;i++)
{
   for(int j=1;j<=i;j++)
{
 System.out.print(j);
}System.out.println();
}
//*********************************************************
System.out.println("___________________________________________________");
for(int a=1;a<=n;a++)
{
  for(int b=a;b<=n;b++)
{
  System.out.print(b);
}System.out.println();
}
System.out.println("___________________________________________________");
for(int c=1;c<=n*2;c++)
{
   for(int d=c;d<=n-c;d++)
{
   System.out.println("*");
}
}System.out.println();
}
}
