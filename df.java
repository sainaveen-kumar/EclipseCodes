package Hash;

import java.util.HashSet;

public class df {

	public static int sum(int n)
	{
		return n+sum(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet  o=new HashSet();
	o.add("A");
	o.add("B");
	o.add("C");
	System.out.println(o+" "+o.size());
	}

}
