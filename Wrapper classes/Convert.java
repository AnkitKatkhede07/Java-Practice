//Convert lower case string to upper case without using inbuilt method 

public class Convert {
    public static void main(String args[]) {

        String S = "ankit";
        String result = "";
       for(int i=0;i<S.length();i++)
	   {
		   char ch = S.charAt(i);
		   if(ch>='a'&&ch<='z')
		   {
			   ch=(char)(ch-32);
		   }
		   result=result+ch;
	   } 
	   System.out.println("Upper Case :"+result);
    }
}
