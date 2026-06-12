public class C {
    public static void main(String[] args) {
        try{

  
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        long c = Long.parseLong(args[2]);
        c += a + b;
        System.out.println(c);
        }
        catch(Exception ex)
        {
              System.out.println(ex);
        }
    }
}