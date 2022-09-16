package Hash;
import java.util.*;
public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
		for(int i=0;i<Math.pow(2, a.length());i++)
		{   
			String t="";
			for(int j=0;j<a.length();j++)
			{	
			 if((i & (1<<j))!=0)
			 {
				t+=a.charAt(j); 
			 }
			}
			System.out.println(t);
		}
		int arr[]= {1,2,3,4};
		for(int i=0;i<Math.pow(2, arr.length);i++)
		{   
			ArrayList <Integer> t=new ArrayList<>();
			for(int j=0;j<arr.length;j++)
			{	
			 if((i & (1<<j))!=0)
			 {
				t.add(arr[j]); 
			 }
			}
			System.out.println(t);
		}

	}

}
