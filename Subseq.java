package Hash;
import java.util.*;
public class Subseq {
 	public static void f(ArrayList<Integer>ds,int arr[],int i ,int n)
 	{
 		if(i>=n)
 		{
 			System.out.println(ds);
 			return;
 		}
 		ds.add(arr[i]);
 		f(ds,arr,i+1,n);
 		ds.remove(ds.size()-1);
 		f(ds,arr,i+1,n);
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		ArrayList<Integer> ds=new ArrayList();
		f(ds,arr,0,arr.length);
	}

}
