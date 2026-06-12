import java.util.*;
public class User
{
public static void main(String x[])
{
  Scanner sc = new Scanner(System.in);
  int no;
  do{
  System.out.print("Enter number user");
   no=sc.nextInt();
  if(no%10==0)
  {
    continue;
  }System.out.println(+no);
  
  }while(true);
}
}