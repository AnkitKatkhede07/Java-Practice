import java.util.*;
public class Table
{
   public static void main (String args[])
{
   Scanner sc= new Scanner(System.in);
     System.out.println("Enter a Number from user");
         int no=sc.nextInt();
           show(no,0);
      }
  public static void show(int x , int count)
{
   ++count;
if(count>10)
{
    System.out.println("End");
}  
else
{
   System.out.println(+x+"*"+count+"="+count*x);
  show(x, count);
}
}
}