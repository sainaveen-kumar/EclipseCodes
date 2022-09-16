package Hash;

class Calc
{
	int n1,n2;
	int r;
	public void  perform()
	{
		r=n1+n2;
	}
}

public class classobject 
{
	public static void main (String args[])
	{
		Calc obj;//reference 
		obj=new Calc();//returns object
		obj.n1=3;
		obj.n2=5;
		obj.perform();
		System.out.println(obj.r);
	}
}
