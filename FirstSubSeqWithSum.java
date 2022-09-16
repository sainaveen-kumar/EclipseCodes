package Hash;
import java.util.*;
public class FirstSubSeqWithSum {
public static boolean f(ArrayList<Integer>ds,int arr[],int i,int n,int s,int rs)
{
	if(i>=n)
	{
		if(s==rs)
		{
			System.out.println(ds);
			return true;
		}
		else
		{
			return false;
		}
	}
	ds.add(arr[i]);
	s+=arr[i];
	if(f(ds,arr,i+1,n,s,rs)==true)
		return true;
	ds.remove(ds.size()-1);
	s-=arr[i];
	if(f(ds,arr,i+1,n,s,rs)==true)
		return true;
	return false;
}
	public static void main(String args[])
	{
		ArrayList <Integer>ds=new ArrayList();
		int arr[]= {1,2,1,2,5};
		int rs=5;
		f(ds,arr,0,5,0,rs);
		
	}
}
