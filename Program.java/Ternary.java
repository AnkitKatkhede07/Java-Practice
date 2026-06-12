//Q3. Write a Java program to find the maximum of two numbers using the ternary operator.
public class Ternary
{
 public static void main(String x[])
{
  int a=Integer.parseInt(x[0]);
  int b=Integer.parseInt(x[1]);
/*if(a>b)
{
 System.out.println("a is max");

}
else
{
  System.out.println("b is max");
}
*/
String str=((a>b)?"a is max":"b is max");
System.out.println(str);
}
}