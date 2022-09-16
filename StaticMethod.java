package Hash;

public class StaticMethod {
    
	static int a=12;
	int b=4;
	static final int c=45;
	public static void main(String[] args)
	{
		System.out.println(StaticMethod.meth());
	}
	static int meth()
	{
	 return c;
	}
}
