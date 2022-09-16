package Hash;
import java.util.*;
public class Epam1 {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int ind=s.nextInt();
		String t="123456789";
		String r="";
		for (int i=0;i<str.length();i++)
		{
			String t1=String.valueOf(str.charAt(i));
			if (t.contains(t1)==true)
			{
				String g="";
				for(int j=0;j<Integer.parseInt(t1)
						;j++)
				{
					g=g+r; 
				}
				r=g;
				//r+=r.repeat(Integer.parseInt(t1)-1);
			}
			else
			{
				
				r=r+str.charAt(i);
			}
		}
		System.out.println(String.valueOf(r.charAt(ind-1)));
	}
}
