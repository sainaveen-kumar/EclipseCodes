package Hash;
import java.util.*;
public class SubseqWithSum 
{

	public static void f(ArrayList<Integer> ds,int s,int rs,int arr[],int i,int n)
	
	{
		if (i>=n)
		{
			if (s==rs)
			{
				System.out.println(ds);
				
			}
			return;
		}
		ds.add(arr[i]);
		s=s+arr[i];
		f(ds,s,rs,arr,i+1,n);
		s=s-arr[i];
		ds.remove(ds.size()-1);
		f(ds,s,rs,arr,i+1,n);
		
	}
	public static void main(String args[])
	{
		ArrayList<Integer> ds=new ArrayList();
		int arr[]= {1,2,1,2,5};
		int rs=5;
		f(ds,0,rs,arr,0,5);
	}
}
