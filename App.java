import java.util.*;
class A
{
 void show()
 {
System.out.println("I show A");
}
}
class B extends A
{
void show(){
System.out.println("I show B");
}
}
public class App{
public static void main(String args[])
{
   App a=new App();
   a.show();
}
}