import java.util.*;
public class TwoPointer
{
  public static void main(String args[])
  
{
int target=15;
   int arr[]={1,2,3,5,7,10,11,15};
   int left = 0;
   int right = arr.length - 1;

while(left < right)
{
int sum = arr[left] + arr[right];

if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right]);
                break;
}
else if(sum < target)
{
  left++;
}
else
{
   right--;
}

}
}

}