class LinkedList{
	private Node head;
	private class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void insert(int n)
	{
		Node temp=head;
		Node newNode=new Node(n);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	public void removeDupInSorted()
	{
		Node temp=head;
		while(temp!=null&&temp.next!=null)
		{
			if(temp.data==temp.next.data)
			{
				temp.next=temp.next.next;
			}
			else{
				temp=temp.next;
			}
		}
	}
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
}
	
class RemoveDupInSorted
{
	public static void main(String[] args)
	{
		LinkedList li=new LinkedList();
		li.insert(4);
		li.insert(4);
		li.insert(5);
		li.insert(6);
		li.insert(6);
		li.insert(6);
		li.insert(7);
		li.insert(8);
		li.insert(8);
		li.removeDupInSorted();
		li.print();
	}
}