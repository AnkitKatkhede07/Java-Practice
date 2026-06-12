/*Thread class*/
class Test1 extends Thread 
{ public void run()
  {   try{
	    for(int i=1; i<=5; i++)
		{ System.out.printf("First Thread = %d\t%b\n",i,isAlive());
			if(i==3)
			{  stop();
			}
		  Thread.sleep(1000);
		}
	 }
	 catch(InterruptedException ex)
	 { System.out.println("Error is "+ex);
	 }
  }
}

class Test extends Thread 
{
  public void run()
  {
         try{
	    for(int i=1; i<=5; i++)
		{ System.out.printf("I = %d\n",i);
		  Thread.sleep(100);
		}
	 }
	 catch(InterruptedException ex)
	 { System.out.println("Error is "+ex);
	 }
  }
}
public class TestApplication
{   public static void main(String x[])
	{  Test t1 = new Test();
	   t1.start();
	   
	    Test1 t2 = new Test1();
	   t2.start(); 
	}
}

