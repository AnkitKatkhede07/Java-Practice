import java.util.*;
public class PrintTable
{
 public static void main(String x[])
{
  Scanner sc = new Scanner(System.in);
System.out.println("Enter a number from size");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter a Elemnt in arrrya");
for(int i=0;i<arr.length;i++)
{
  arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+" ");
}

int b[]=new int [arr.length];
System.out.println("Enter a Elmemrt in arjr");
for(int i=0;i<arr.length;i++)
{
  b[i]=arr[i];
}
for(int i=0;i<arr.length;i++)
{
System.out.println(b[i]+" ");
}
}
}