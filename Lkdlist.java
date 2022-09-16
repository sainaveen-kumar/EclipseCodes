package Hash;


public class Lkdlist {
	
	class Node
	{
		int val;
		Node next;
		Node(int d)
		{
			this.val=d;
			this.next=null;
		}
	}
	Node head=null;
	Node tail=null;	
	
	public void addNodeatend(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
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
	
	public void addbefore(int key,int tar)
	{
		Node t=head;
		while(t.next.val!=key)
		{
			t=t.next;
			if (t==null)
			{
				break;
			}
		}
	
		if (t!=null)
		{
			Node newnode=new Node(tar);
			newnode.next=t.next;
			t.next=newnode;
		}
		
	}
	
	public void display()
	{
		Node t=head;
		while(t!=null)
		{
			System.out.println(t.val+" ");
			t=t.next;
		}
		System.out.println("-------------");
	}
	public void insertAtBeg(int data)
	{
		Node newnode=new Node(data);
		if (head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
	public void insertAfter(int key,int tar)
	{
		Node temp=head;
		while(temp.val!=key)
		{
			//System.out.println(temp.val);
			temp=temp.next;
			
			if (temp==null)
					{
				break;
					}
			
		}
		if(temp!=null)
		{
			Node newnode=new Node(tar);
			newnode.next=temp.next;
			temp.next=newnode;
		}
	}
	public void delend()
	{
		System.out.println("tail"+tail.val);
		if (head==null)
		{
			System.out.print("Underflow");
		}
		else
		{
			Node t=head;
			while(t.next.next!=null)
			{
				t=t.next;
			}
			t.next=null;
			tail=t;
			
		}
		System.out.println("tail"+tail.val);
		
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lkdlist ll=new Lkdlist();
		System.out.println(ll.head);
		ll.addNodeatend(10);
		ll.addNodeatend(20);
		ll.addNodeatend(30);
		ll.addNodeatend(40);
		
		ll.insertAtBeg(50);
		ll.insertAtBeg(60);
		ll.insertAtBeg(70);
		ll.insertAtBeg(80);
		//
		//
		ll.insertAfter(50,67);
		ll.addbefore(67, 25);
		
		ll.display();
		ll.delend();
		ll.display();
		


	}

}
