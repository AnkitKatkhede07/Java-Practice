import java.util.*;
public class Paldrome
{
  public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number from user:");
int no=sc.nextInt(),rev=0;int temp=no;

for(;no!=0;)
{
  int digit =no%10;
   rev+=digit*digit*digit;
    no=no/10;
}
if(temp==rev)
{
System.out.println("number is amstrong");
}
else
{
System.out.println(" number not is amstrong");

}
}
}