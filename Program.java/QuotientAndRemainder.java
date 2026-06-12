//Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
//Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
 public class QuotientAndRemainder
 {
  public static void main(String x[])
  {
    int Dividend=20;
	int divisor=3;
	int Quotient=Dividend/divisor;
	int Remainder=Dividend%divisor;
	System.out.println("Quotient : " +Quotient+ " : Remainder : " +Remainder);
  }
 }
