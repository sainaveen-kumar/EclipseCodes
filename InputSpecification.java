package Hash;
import java.util.Scanner;
public class InputSpecification {
    
	
 
	public static void main(String[] args)
	{
		/*System.out.println("Enter any value");
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		char a[]=new char[t];
		for (int i=0;i<t;i++)
		{
			String st=s.next();
			a[i]=st.charAt(0);
		}
		for (int i=0;i<t;i++)
		{
			System.out.println(a[i]);
		}
		*/
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String t1=s.next();
		System.out.println("enter string");
		String t2=s.next();
		System.out.println(t1.concat(t2));*/
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String t1=s.next();
		System.out.println("enter string");
		String t2=s.next();
		System.out.println(t1.compareTo(t2));//returns 0 if it is true.
		System.out.println(t1.compareToIgnoreCase(t2));
		if(t1.equals(t2))
		{
			System.out.println("True");
		}
		
		
	}

}
