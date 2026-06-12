//Q1. Write a Java program to swap two numbers using arithmetic operators (+ and -) without using a third variable.


public class Swap
{
 public static void main (String args[])
{

  int a=10;
  int b=5;
System.out.println("Before swapping: a = " + a + ", b = " + b);
a=a+b;
b=a-b;
a=a-b;

System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}