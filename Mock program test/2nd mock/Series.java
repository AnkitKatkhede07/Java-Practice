/*Q5. Write a Java program to display the following series using function :  
 3   6   12   24   48   96  192  
 (Each term doubles from the previous term starting at 3)*/
 public class Series
 {
  public static void main(String []args)
  {
   for(int i=1;i<7;i++)
   {
    int sum=i*3;
	//sum=sum*6;
	System.out.println(+sum);
   }
  }
 }