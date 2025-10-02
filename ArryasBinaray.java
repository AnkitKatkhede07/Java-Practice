public class ArryasBinaray
{
public static int binaraySearch(int no[],int key)
{
  int start=0; 
  int end=no.length-1;
  while(start<=end)
  {
   int mid=(start+end)/2;
   if(no[mid]==key)
   { 
   return mid;
   }
   if(no[mid]<key)
   {
   start=mid+1;
   }
   else{
   end=mid-1;
   }
  }return -1;
}
 public static void main(String args[])
 {
   int no[]={2,4,6,8,10,12,14};
   int key=10;
   System.out.println("BinaraySearch is :"+binaraySearch(no,key));
 }
}