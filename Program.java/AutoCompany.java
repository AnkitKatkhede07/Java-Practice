/*Q32. An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). 
A company manager wants to make the production of 
both types of vehicle according to the given data below:
• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
• 2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need 
to manufacture as per the given data.
Example :
Input : • 200 -> Value of V
• 540 -> Value of W
Output : • TW =130   FW=70
Explanation: 130+70 = 200 vehicles (70*4)+(130*2)= 540 wheels
*/ 
import java.util.*;
public class AutoCompany
{
 public static void main(String []args)
{
	//int tv,tw;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a vehicle");
int tv=sc.nextInt();
System.out.println("Enter a wheels");
int tw=sc.nextInt();
int f=(tw-2*tv)/2;
int t=tv-f;
System.out.println("Total number of vehicle :"+f);
System.out.println("Total number of wheels:"+t);
}
}