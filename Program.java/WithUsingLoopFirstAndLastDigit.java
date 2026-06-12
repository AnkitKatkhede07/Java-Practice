public class WithUsingLoopFirstAndLastDigit
{
public static void main (String x[])
{
 if (x.length !=1){
 System.out.println("Enter three digit number");
 return;
 }
 
  int number=Integer.parseInt(x[0]);
  if (number<100||number>999){
  System.out.println("invalid input !: ");
  return;
  }
   int firstdigit = number/100;
   int lastdigit = number%10;
   System.out.println("enter the amount :"+firstdigit);
   System.out.println("enter the amount :"+lastdigit);

  
}

}