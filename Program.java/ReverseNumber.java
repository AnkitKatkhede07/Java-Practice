public class ReverseNumber
 {
	//private static int reversedNumber=0;
	public static int reverseNumberRecursive(int num,int reversed)
	{
	  if (num == 0){
	     return reversed;
	     }
	//Extract the last digit
	int digit = num%10;
	return
	reverseNumberRecursive(num/10,reversed * 10 + digit);
	}
    //withoutusingloop
  public static void main(String x[])
  {
  int number = Integer.parseInt(x[0]);//Get input from command line with interger
  //System.out.printf("the number:"+number);
  //call the recursive funcation to reverse the number
  int reversedNumber = reverseNumberRecursive(number,0);
  //print the reversed number
  System.out.println("Reversed number:"+reversedNumber);

  }

 }