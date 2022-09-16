package Hash;

public class Dlkd {
	public class Node
	{
		int val;
		Node next;
		Node prev;
		Node(int d)
		{
			this.val=d;
			this.next=null;
			this.prev=null;
		}
	}
		Node head=null;
		Node tail=null;
		

	public void insert_end(int d)
	{  
	Node newnode=new Node(d);
	if(head==null)
	{
		head=newnode;
		tail=newnode;
		head.next=null;
		tail.next=null;
		
	}
	else
		{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
			tail.next=null;
		}
	}
	public void insert_beg(int d)
	{
		Node newnode=new Node(d);
		if(head==null)
		{
			head=tail=newnode;
			head.next=null;
			tail.prev=null;
			
		}
		else
		{
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
			
		}
	}
	public void frontaldisplay()
	{   
		Node t=head;
		while(t!=null)
		{
			System.out.println(t.val);
			t=t.next;
		}
	}
	public void posteriordisplay()
	{
		Node t=tail;
		while(t!=null)
		{
			System.out.println(t.val);
			t=t.prev;
		}
	}
	public void insertposition(int element,int pos)
	{
		Node newnode=new Node(element);
		
		
		
	}

	
	public static void main(String[] args)
	{
		Dlkd dll=new Dlkd();
		System.out.println(head);
		dll.insert_end(10);
		dll.insert_end(20);
		dll.insert_end(30);
		dll.insert_end(40);
		dll.insert_end(50);
		dll.posteriordisplay();
		System.out.println("==========");
	    dll.frontaldisplay();
	    System.out.println("==========");
	    dll.insert_beg(60);
	    dll.insert_beg(70);
	    dll.insert_beg(80);
	    dll.insert_beg(90);
		dll.frontaldisplay();
	}
}

