//Q6. Write a Java program to input three numbers and find the largest among them using nested if.
import java.util.Scanner;
public class large
{
 public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
System.out.println("Enter a First Number:");
int n1=sc.nextInt();
System.out.println("Enter a Second Number:");
int n2=sc.nextInt();
System.out.println("Enter a third Number:");
int n3=sc.nextInt();

 if(n1>=n2)
{
  if(n1>=n3)
{
  System.out.println("first number is Largest"+n1);
}
}
if(n2>=n1)
{
 if(n2>=n3)
{
   System.out.println("Secound number is Largest"+n2);

}
}
if(n3>=n1)
{
  if(n3>=n2)
{
 System.out.println("Third Number is Largest"+n3);
}
}
/* if (n1 >= n2) {          // Outer if
            if (n1 >= n3) {      // Inner if
                System.out.println("First number is the largest: " + n1);
            } else {
                System.out.println("Third number is the largest: " + n3);
            }
        } else {                 // Outer else
            if (n2 >= n3) {
                System.out.println("Second number is the largest: " + n2);
            } else {
                System.out.println("Third number is the largest: " + n3);
            }
        }*/

}
}