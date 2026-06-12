import java.util.Scanner;
public class DemoSwitch
{
public static void main(String []args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a Charater of case:");
 char ch=sc.next().charAt(0);
 switch(ch)
 {
 case 'A':
 System.out.println("Excellent");
 break;
 case 'B':
 System.out.println("Good");
 break;
 case 'C':
 System.out.println("Average");
 break;
 case 'D':
 System.out.println("Poor");
 break;
 case 'F':
 System.out.println("Fail");
 break;
 default:
 System.out.println("invaild input");
 }
}
}