package Hash;
import java.util.*;
import java.util.Arrays;
public class BasicFormating {

public static int sum(int a, int b)
{
return a+b;
}
public static void main(String args[])
{
	/*double a=23.45;
	float df=23.4355f;
	System.out.printf("%.4f\n",a);
	System.out.printf("%.2f\n",df);
	System.out.println(Math.round(a));
	System.out.println(Math.round(df));
	System.out.println(sum(34,56));
	double aa = 123.13698;
	double roundOff = Math.round(aa*100)/100;
	System.out.println(roundOff);
	double k=Math.round(df*100)/100;
	System.out.println(k);
	float myFloat = 2.56561f;
	String u=String.valueOf(myFloat);
	System.out.println(u.substring(0,u.indexOf("."))+u.substring(u.indexOf("."),u.indexOf(".")+5));
	String formattedString = String.format("%.02f", myFloat);
	System.out.println(formattedString);
	int we=123;
	String rt="987967";
	//System.out.println(String.valueOf(rt));
	int qw=Integer.parseInt(rt);
	System.out.println(qw);
	*/
	String a="123";
	int b=Integer.valueOf(a);
	System.out.println(b);
	Integer ab[]= {2,4,7,2,4};
	//[ 0,1,2,3,4,5,6] 
	
	int max = Collections.max(Arrays.asList(ab));
	int r[]=new int[max];
	for (int i=0;i<ab.length;i++)
	{
		r[ab[i]-1]+=1;
	}
	for (int i=0;i<r.length;i++)
	{
		System.out.println(r[i]);
	}
	


}
}

