package Hash;
import java.util.*;
public class LL {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list= new LinkedList();
		list.add(12);
		list.add(23);
		list.add(34);
	    Iterator<Integer>itr=list.iterator();
		
		list.add(1,20);
		System.out.println(list);
	}

}
