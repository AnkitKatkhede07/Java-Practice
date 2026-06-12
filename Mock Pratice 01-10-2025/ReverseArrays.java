//5. Reverse an Array
import java.util.*;
public class ReverseArrays{
public static void reverse(int a[])
{
     int first=0;
	 int last=a.length-1;
	 while(first<last){
	 //swap
	 int tem=a[first];
	 a[first]=a[last];
	 a[last]=tem;
	 
	 first ++;
	 last --;
	 }
	 System.out.println("Reversed array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
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
 reverse(a);
}
}
