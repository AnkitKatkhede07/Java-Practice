public class PAPP
{
  public static void main(String args[])
  {
     int ind=3,bas=5,result;
	 result=calPow(3,5);
	 System.out.println(result);
  }
  public static int calPow(int index,int base)
  {
     int p=1;
	 for(int i=1;i<=index;i++)
	 {
	   p=p*base;
	 }return p;
  } 
}