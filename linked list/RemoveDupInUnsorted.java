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
	
	public void removeDupInUnsorted()
	{
		Node temp=head;
		while(temp!=null&&temp.next!=null)
		{
			Node temp2=temp;
			while(temp2!=null&&temp2.next!=null)
			{
				if(temp2.next.data!=temp.data)
				{
					temp2=temp2.next;
				}else{
					temp2.next=temp2.next.next;
				}
			}
			temp=temp.next;
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
	
class RemoveDupInUnsorted
{
	public static void main(String[] args)
	{
		LinkedList li=new LinkedList();
		li.insert(6);
		li.insert(4);
		li.insert(5);
		li.insert(4);
		li.insert(8);
		li.insert(6);
		li.insert(7);
		li.insert(7);
		li.insert(8);
		li.removeDupInUnsorted();
		li.print();
	}
}