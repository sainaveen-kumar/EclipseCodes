package Hash;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="MadaM";
        StringBuilder o=new StringBuilder("MadaM");
        o.reverse();
        if (t.equals(String.valueOf(o)))
        {
        	System.out.println("Palindrome");
        }
	}

}
