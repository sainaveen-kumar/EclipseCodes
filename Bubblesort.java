package Hash;

import java.util.Scanner;

public class Bubblesort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		int arr[]=new int[d];
		for(int i=0;i<d;i++)
		{
			arr[i]=s.nextInt();
		}
	    for(int i=0;i<arr.length-1;i++)
	    {
	    	for(int j=0;j<arr.length-1-i;j++)
	    	{
	    		if (arr[j]>arr[j+1])
	    				{
	    			      int t=arr[j];
	    			      arr[j]=arr[j+1];
	    			      arr[j+1]=t;
	    			      
	    				}
	    	}
	    }
	    for(int i=0;i<arr.length-1;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	}

}
