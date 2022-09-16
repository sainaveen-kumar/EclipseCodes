package Hash;

import java.util.Scanner;

public class Binarysearch {

	static int search(int a[],int n,int t)
	{
		int l=0;
		int r=a.length-1;
		int m;
		while (l<=r)
		{
			m=l+(r-1)/2;
			if (a[m]==t)
			{
				return m;
			}
			else if (a[m]<t)
			{
				l=m+1;
			}
			else if(a[m]>t)
			{
				r=m-1;
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
		int r=search(arr,arr.length,5);
		System.out.println(r);

	}

}
