/*Q.3 Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.*/
  class Compare
  {
  void conditional(int a, int b)
  {
  if(a==b)
  {
  System.out.println( +a+"both are equal"+b);
  }
   else if(a>b)
  {
  System.out.println(+a+"is greater"+b);
  }
  else {
  System.out.println( +a+"is less:"+b);
  }
  }
  
  public static void main(String [] args)
  {
  Compare com= new Compare();
  com.conditional(10,10);
  com.conditional(15,5);
  com.conditional(10,20);
  
  
  }  
  }