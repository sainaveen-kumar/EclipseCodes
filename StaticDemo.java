package Hash;

class Emp
{
	int eid;
	int sal;
	static String ceo;
	
	static
	{
		ceo="harish";
		System.out.println("In static");
		
	}
	public void show()
	{
		System.out.println(eid+":"+sal+":"+ceo);
	}
	public Emp()
	{
		eid=1;
		sal=23000;
		System.out.println("In constructor");
	}
	
}



public class StaticDemo
{
	public static void main(String args[])
	{
		Emp navin=new Emp();
		Emp kumar=new Emp();
		navin.eid=8;
		navin.sal=4800;
		navin.ceo="Sai Naveen";//----
		navin.show();
		kumar.show();
		kumar.eid=9;
		kumar.sal=5000;
		//kumar.ceo="Nandu";//----
		navin.show();
		kumar.show();
		
		
		
	}
}
