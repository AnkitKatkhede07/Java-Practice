public class C3 {
    public static void main(String[] args) {
        try{
        
        char ch=args[0].charAt(0);
        System.out.println(ch);
        char y=args[0].charAt(1);
        System.out.println(y);
        char x=args[0].charAt(2);
        System.out.println(x);
        char a=args[0].charAt(3);
        System.out.println(a);
        char b=args[0].charAt(4);
        System.out.println(b);
        int v=Integer.parseInt(args[5]);
        float f=Float.parseFloat(args[6]);
        double d=Double.parseDouble(args[7]);
        System.out.println(v);
        System.out.println(f);
        System.out.println(d);
        }
      
           catch(Exception ex)
           {
              System.out.println(ex);
           }
    

    }
}
