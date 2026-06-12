//Write a C program to count the number of digits in a number.
import java.util.*;
public class NUmCount
{
public static void main(String []args)
 {
int num,count;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number of keyborad");
  num=sc.nextInt();
  count=0;
  if(num==0){
  count=1;
  }
  else{
  if(num<10)
  {
   num=-num;
  }
  
  while(num!=0)
  {
   num=num/10;
   count++;
  }
  System.out.println(count);
}
}
}