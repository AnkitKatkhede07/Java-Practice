//Q5. Write a Java program to check if a given number is even or odd, and also check if it is divisible by 5.
public class checknum
{
 public static void main(String args[])
{
  int no=Integer.parseInt(args[0]);
   if(no%2==0)
{
  System.out.println("Number is Even");
}
else
{
System.out.println("Number is odd");
}
if(no%5==0)
{
  System.out.println("Number is divisible by 5");
}
else {
            System.out.println("Number is not divisible by 5");
        }
}
}