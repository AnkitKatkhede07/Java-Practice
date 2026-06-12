import java.util.*;
public class RemoveEven
{
  public static void main(String args[])
  {
    ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(15);
list.add(20);

Iterator<Integer> itr = list.iterator();

while(itr.hasNext()) {
    int num = itr.next();

    if(num % 2 == 0) {   // remove even numbers
        // itr.remove();
		System.out.println(num);
    }
}

//System.out.println(list);   // Output: [15]

  }
}