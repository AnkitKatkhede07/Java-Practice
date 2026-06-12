import java.io.*;
public class DriveAssess
{
 public static void main(String args[])
 {
   File roots[]=File.listRoots();
   for(int i=0;i<roots.length;i++)
   {
     long totalSpace=roots[i].getTotalSpace();
	 long freeSpace=roots[i].getFreeSpace();
	
            long totalGB = totalSpace / (1024 * 1024 * 1024);
            long freeGB  = freeSpace  / (1024 * 1024 * 1024);
			long freeBits = freeSpace * 8;
           System.out.println("Free Space in Bits: " + freeBits);


            System.out.println("Drive: " + roots[i]);
            System.out.println("Total Space: " + totalGB + " GB");
            System.out.println("Free Space : " + freeGB + " GB");
            System.out.println("------------------------");
   }
   
 }
}