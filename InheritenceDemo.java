 package Hash;

class Calculator  //super class  or parent or 
{ 
	public int add(int i,int j)
	{
		return i+j;
	}
}
class Caladv extends Calculator//sub class  or chilkd
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}


class Vadv extends Caladv
{
	
}

 
public class InheritenceDemo 

{
	public static void main(String[] args)
	{
		Caladv obj=new Caladv();
		int r=obj.add(5, 7);
		int r2=obj.sub(5,7);
		Vadv c1=new Vadv();
		int y=c1.sub(0,0);
		System.out.println(r+" "+r2 +" "+y);
	}

}
