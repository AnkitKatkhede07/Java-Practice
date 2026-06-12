//Q10. Write a java program to count the number of digits in a number.
public class CountNum
{
 public static void main(String[]args)
 {
int count=0;	 int num=123254;
 while(num!=0)
 {
  num=num/10;
  count++;
 }
  System.out.println("the count num is:"+count);
 }
}