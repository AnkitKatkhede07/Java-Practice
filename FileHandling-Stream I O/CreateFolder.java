import java.io.*;
public class CreateFolder
{
  public static void main(String args[])
  {
    File f=new File("D:\\Program\\July2025");
	if(f.exists())
	{
		  System.out.println("Folder already exist");	 
	}
	else{
	boolean b=f.mkdir();
	if(b)
	{
	  System.out.println("Folder created successfully");
	}
	else
	{
	  System.out.println("Some problem is there.......");
	}
	}
  }
}