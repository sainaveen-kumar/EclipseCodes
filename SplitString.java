package Hash;
import java.util.*;
public class SplitString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HashMap<String,Integer> h=new HashMap();
		String s1=s.nextLine();
		//System.out.println(s1);
		//System.out.println(s2);
		String a[]=s1.split("\\s+");
		for(String i:a)
		{
			if (h.containsKey(i))
			{
				h.replace(i, h.get(i)+1);
			}
			else
			{
				h.put(i,1);
			}
		}
		System.out.println(h);

	}

}
