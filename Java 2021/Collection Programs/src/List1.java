import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static java.lang.System.*;
public class List1 {
   public static void main(String []args) {
	   List<String> l1 = new ArrayList<String>();
	   l1.add("C");
	   l1.add("C++");
	   l1.add("Data Structure");
	   l1.add("Java");
	   l1.add("java Script");
	   //Print ArrayList elements
	   //1. way
	   l1.forEach(e -> out.printf("%s  ", e));
	   //2. way
	   out.println(l1);
	   
	   //3. way
	   Iterator<String> itr = l1.iterator();
	   while(itr.hasNext())
		   out.print(itr.next()+ "   ");
	   
	   // Reverse
	   
	   
   }
}
