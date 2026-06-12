import java.util.Scanner;
public class IfStatment
{
 public static void main(String []args)
 {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter A value to user");
	int Select=sc.nextInt();
	switch(Select)
	{
		case 1:
		{
		System.out.println("HEllo");
		break;
		}
		case 2:
		{System.out.println("HEllo");
		break;
		}case 3 :
		System.out.println("HEllo");
		break;
		default:
		System.out.println("not number  valid");
		
	}
 }
}