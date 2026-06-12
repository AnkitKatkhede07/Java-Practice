import java.util.*;
public class DuckNumber
{
  public static void main(String args[])
  {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter a Number from User");
	/*  int n=sc.nextInt(); */
	String n=sc.next();
	 /* for(int i=0;i<=n;i++)
	 {
	    int no=i;
		boolean flag=false;
		while(no!=0)
		{
		  int digit=no%10;
		  if(digit==0)
		  {
		    flag=true;
			break;
		  }
		  no=no/10;
		}
		if(flag)
		{
		  System.out.println(i);
		}
       } */	
/* if(n==0)
{
	 System.out.println("Is not Duck Number");
}	
else{
	 int no=n;
	 boolean flag=false;
	 
    while(no!=0)
	{
		int digit=no%10;
		if(digit==0)
		{
			flag=true;
			break;
		}
		no=no/10;
	}
if(flag)
{
	 System.out.println("is Duck nUmber");
}	
else{
  System.out.println("is not Duck Number");
}
	} */
	if(n.charAt(0)=='0')
	{
		 System.out.println("is not duck number");
	}
	else
	{
		boolean flag=false;
		for(int i=0;i<n.length();i++)
		{
			 if(n.charAt(i)=='0')
			 {
				  flag=true;
				  break;
			 }
		
		}
		
	if(flag)
		System.out.println("is Duck number");
	else
		System.out.println("is not Duck number");
	}
  }
}