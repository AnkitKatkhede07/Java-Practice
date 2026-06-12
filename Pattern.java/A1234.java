public class A1234
{
public static void main(String []args)
{
	int no=1;
 for(int i=1;i<=4;i++)
 {
	 for(int j=1;j<=7;j++)
	 {
		 if(j==5-i)
		   System.out.print(no); 
		 else if(j==3+i)
			 System.out.print(i);
		 else
           System.out.print(" ");        
	 }
	    System.out.println("\n");
  }
}
}