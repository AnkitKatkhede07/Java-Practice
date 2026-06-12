public class Doulacte 
{
  public static void main(String x[])
{
  int []arr={10,20,20,50};
int n=doublacte(arr);
System.out.println("The uniq Element is:");
for(int i=0;i<n; i++)
{
  System.out.println(arr[i]+" ");
}
} 
static int doublacte(int []arr)
{int i=0;
 
for(int j=1;j<arr.length;j++)
{
  if(arr[i]!=arr[j])
{
  i++;
  arr[i]=arr[j];
}
}return i+1;
}
}


