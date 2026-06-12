public class Palodaram
{
 public static void main(String []args)
 {
 int n=0;
  for(int i=1;i<=4;i++)
  {
  n=i;
  for(int j=1;j<=7;j++)
  {
  if(j>=5-i&&j<=3+i)
  {
  System.out.print( n);
  if(j<4)
  {
  n++;
  }
  else
  {
  n--;
  }
  }
  else
  {
   System.out.print(" ");
  }
  }
  System.out.println("\n");
  }
 }
}
