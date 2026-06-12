//write a program do while multiply by 10
import java.util.Scanner;
public class Mult
{
public static void main (String[]args)
{
  Scanner sc = new Scanner(System.in);
  do{
  System.out.print("Enter a Number for User:");
  int num=sc.nextInt();
  if(num%10==0)
  {
  break;
  }System.out.println(num);
  }while(true);
  System.out.println("Condition is break");
}
}