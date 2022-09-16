package Hash;

public class ReverseLinkedList {
	public class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
					
		}
		
	}
	Node head=null;
	Node tail=null;
	public void insert(int data)
	{
		Node t=new Node(data);
		if (head==null)
		{
			head=t;
			tail=t;
		}
		else
		{
			tail.next=t;
			tail=t;
		}
	}
	public void print()
	{
		Node y=head;
		while(y!=null)
		{
			System.out.println(y.data);
			y=y.next;
		}
		System.out.println("-------------");
	}
	public void reverse()
	{
		Node current=head;
		/*while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
			}*/
		Node NEXT=null;
		Node prev=null;
		while(current!=null)
		{
			NEXT=current.next;
			current.next=prev;
			prev=current;
			current=NEXT;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList ob=new ReverseLinkedList();
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);
		ob.insert(40);
		ob.print();
		ob.reverse();
	
		ob.print();

		

	}

}
