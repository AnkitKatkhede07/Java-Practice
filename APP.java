class A {
    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
	int a;
	B(int A)
	{
		this.a=A;
	}
    B() {
		super();
        this(10);    
          
    }
}
public class APP
{
  public static void main (String args[])
  {
     B b= new B();
  }
}
