package Hash;

public class Butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for (int i=1;i<n+1;i++)
		{
			System.out.println("*".repeat(i)+" ".repeat((n-i)*2)+"*".repeat(i));
		}
		for (int i=n;i>0;i--)
		{
			System.out.println("*".repeat(i)+" ".repeat((n-i)*2)+"*".repeat(i));
		}
		}

	}



