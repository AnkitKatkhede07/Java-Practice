import java.io.*;
public class DLAPP
{
public static void main(String args[])
{
   file roots[]=file.listRoots();
   for(int i=0;i<roots.length;i++)
   {
      long totalSpace=roots[i].getTotalSpace();
	  long freeSpace=roots[i].getafreeSpace();
	  System.out.println(roots[i]+"\t"+(totalSpace/107374124)+"  GB "+"\t"+(freeSpace/10));
	  1073741824);
   }
}
}