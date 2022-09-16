package Hash;
class Cal
{
	int n1,n2;
	public Cal()
	{
		n1=5;
		n2=10;
		System.out.println("In Cal Constructor");
	}
	public Cal(int k)
	{
		n1=k;
		n2=n1+k;
	}
	public Cal (double f)
	{
		n1=(int)f+n2;
		n2=(int)f+n1;
	}
	
}





public class Conexample 
{
	public static void main(String args[])
	{
		Cal obj=new Cal();
		System.out.println(obj.n1+" "+obj.n2);
		Cal obj2=new Cal(10);
		System.out.println(obj2.n1+" "+obj2.n2);
		Cal obj3=new Cal(23.45);
		System.out.println(obj3.n1+" "+obj3.n2);
	}
}
