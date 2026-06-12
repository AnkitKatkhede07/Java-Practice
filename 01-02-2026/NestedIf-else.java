// Example: We want to input age of voter and generate voter id but voter id should generate 
// When age of voter is greater than 18 and voter should be less than 10000

import java.util.Scanner;
class NestedIfelse {
    public static void main(String[] args) {
        int no=Integer.parseInt(args[0]);
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        if(n<=1000)
    {
        if(no>=18)
        {
            System.out.println("id Should Generate");
        }
        else
        {
             System.out.println("id not! genrate");
        }
    }
    else
    {
        System.out.println("Invalid in put");
    }
       
    }
}