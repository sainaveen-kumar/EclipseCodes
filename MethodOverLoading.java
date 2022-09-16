package Hash;

class Casio
{
	int n1;
	int n2;
	String operation;
	public Casio()
	{
		n1=0;
		n2=0;
		operation="Nothing";
	}
	public Casio(int i)
	{
		n1=0;
		n2=0;
		operation="Nothing";

	}
	public Casio(int i,int j)
	{
		n1=0;
		n2=0;
		operation="Nothing";

	}
	
	
	
	
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
}
public class MethodOverLoading
{
	public static void main(String args[])
	{
		Casio obj=new Casio(4,5);
		obj.add(1, 2);
		obj.add(1,2,3);
	//obj.add(1, 2,3);
	}
	
}
