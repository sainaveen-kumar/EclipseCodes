package Hash;
import java.util.Scanner;
public class SwapCase {

	public static void main(String[] args) 
	{
	 Scanner s=new Scanner(System.in);
	 String s1=s.nextLine();
	 System.out.println(s1);
	 String t="";
	 for (int i=0;i<s1.length();i++)
	 {
		 char t1=s1.charAt(i);
		 if (Character.isUpperCase(t1))
		 {
			 t+=Character.toLowerCase(t1);
		 }
		 else if (Character.isLowerCase(t1))
		 {
			 t+=Character.toUpperCase(t1);
		 }
		 else
		 {
			 t+=t1;
		 }
	 }
	 System.out.println(t);	 
	}
}
