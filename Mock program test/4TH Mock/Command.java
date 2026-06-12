//1.Write program to input two values using command line argument and perform its swapping?

public class Command
{
  public static void main(String args[])
  {

    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
   System.out.println("After swaping:"+a+","+b);
    /*int temp=a+b;
    a=temp-a;
    b=temp-b;*/
  /* a=a^b;//30,15
   b=a^b;
   a=a^b;
*/
a=a+b;
b=a-b;
a=a-b;

    
   System.out.println("Befor swaping:"+a+","+b);

  }
}