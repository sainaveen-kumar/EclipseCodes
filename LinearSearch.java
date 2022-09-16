package Hash;
import java.util.*;
public class LinearSearch {

	
	static int search(int a[],int n ,int t)
	{
		for (int i=0;i<n;i++)
		{
			if (a[i]==t)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		int arr[]=new int[d];
		for(int i=0;i<d;i++)
		{
			arr[i]=s.nextInt();
		}
		int r=search(arr,arr.length,10);
		System.out.println(r);
	}

}
