package Hash;

public class Elkdlst {

	
	public class Node
	{
		int coeff;
		int exp;
		Node next;
		Node(int d,int p)
		{
			this.coeff=d;
			this.exp=p;
			this.next=null;
		}
		
	}
	public void display()
	{
		Node t=head;
		while(t!=null)
		{
			System.out.println(t.coeff+" "+t.exp);
			t=t.next;
		}
	}
	public void insert(int t1,int t2)
	{
		Node t=head;
		Node newnode=new Node(t1,t2);
		if (t==null)
		{
		head=newnode;
		tail=newnode;
		}
		else
		{
			tail.next=newnode;
			tail=newnode;
		}
	}
	Node head=null;
	Node tail=null;
	public static void main(String[] args) {
		Elkdlst ob=new Elkdlst();
		ob.insert(5,2);
		ob.insert(4,2);
		ob.display();

	}

}
