import java.util.*;
public class MAPP
{  public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
      int a[][]=new int[3][3];
	  int b[][]=new int[3][3];
	  int c[][]=new int[3][3];
	  System.out.println("Enter values in array 1st");
	  for(int i=0; i<a.length; i++)
	  { for(int j=0;j<a[i].length; j++)
		 { a[i][j]=xyz.nextInt();
		 }
	  }
	  System.out.println("Enter values in array 2nd");
	  for(int i=0; i<b.length; i++)
	  { for(int j=0;j<b[i].length; j++)
		 { b[i][j]=xyz.nextInt();
		 }
	  }
	  System.out.println("display matrix");
	  for(int i=0;i<a.length;i++)
	  {  
	     for(int j=0; j<a[i].length; j++)
		 {  c[i][j] = a[i][j] + b[i][j];
  			 System.out.printf("%d\t",c[i][j]);
		 }
		 System.out.println();
	  }
          
   } 
}
