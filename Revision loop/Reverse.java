//reverse the give number
public class Reverse{
public static void main(String x[])
{
  int no=10899;
  int rev=0;
  int lastdigit;
  for(;no>0;){
  lastdigit=no%10;
  rev=rev*10+lastdigit;
  no=no/10;
  }System.out.println(rev+" ");
}
}