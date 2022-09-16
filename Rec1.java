package Hash;
import java.util.*;
public class Rec1 {
	
	/*public static void met1()
	{
		if (n==4)
		{
			return;
		}
		 
		System.out.println(n);
			n=n+1;
			met1();
		
		
	}*/
    static String s="AM";
    int a[]={1,2,3,4,5};
    int f=1;
	public void sp(int l, int r)
	{
		if (l>=r)
			return ;
		int temp=a[l];
		a[l]=a[r];
		a[r]=temp;
		sp(l+1,r-1);
	}
	public void swap1(int i)
	{
		if (i>=(this.a.length)/2)
			return ;
		
		int temp=this.a[i];
		a[i]=a[this.a.length-i-1];
		a[this.a.length-i-1]=temp;
		swap1(i+1);
	}
	static boolean ispal(String s)
	{
		if(s.length()==0 || s.length()==1)
		{
			return true;
		}
		if (s.charAt(0)==s.charAt(s.length()-1))
		{
			return ispal(s.substring(1,s.length()-1));
		}
		return false;
		
		
	}
	public boolean pal(int l,int r,String s)
	{
		if(l>=r)
		{
			return true;
		}
		if(s.charAt(l)!=s.charAt(r))
			return false;
		return pal(l+1,r-1,s);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rec1 o=new Rec1();
		o.sp(0,4);
		for( int k:o.a)
		{
			System.out.print(k +" ");
		}
		System.out.println(" ");
		o.swap1(0);
		for( int k:o.a)
		{
			System.out.print(k +" ");
		}
		System.out.println(ispal(s));
		System.out.println(o.pal(0, s.length()-1, s));
			

	}

}
