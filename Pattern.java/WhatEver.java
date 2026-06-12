public class WhatEver
{
 public static void main(String []args)
 {
   int n=5;
   for(int i=1;i<n;i++)
  {
	if(i==1)
    {
	 for(int j=1;j<n+1;j++)
     System.out.print(j+" ");
    }
     else {
	System.out.print(i+" ");
	for(int k=1;k<=n-i-1;k++)
	System.out.print(" ");
	System.out.print(n);
	 }
	 System.out.println();
   }
  }
 }