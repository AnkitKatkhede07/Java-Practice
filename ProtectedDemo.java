class ProtectedDemo {
    protected int a = 40;

/*     protected void show() {
        System.out.println("Protected method");
    } */
	 
	 public static void main(String[] args) {
        Child obj = new Child();
        /* obj.show(); */
		obj.show();
        System.out.println(obj.a);
}
}

class Child extends ProtectedDemo {
	void show()
	{
		System.out.println("private method");
	}
   
    }



