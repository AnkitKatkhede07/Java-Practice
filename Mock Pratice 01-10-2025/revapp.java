import java.util.*;
public class revapp
{
 public static void main(String x[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter array in size:");
 int size=sc.nextInt();
 int a[]=new int[size];
 System.out.println("Enter array in Element:");
 for(int i=0;i<a.length;i++)
 {
   a[i]=sc.nextInt();
 }
  System.out.println("Array in reverse order:");
        for (int i = a.length - 1; i >= 0; i--) {   
            System.out.print(a[i] + " ");
        }

        System.out.println(); // new line at end
}}