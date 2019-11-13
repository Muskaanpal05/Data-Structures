import java.util.*;
class LinkedList{
	Node head;
	class Node{
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
			
			Node newNode=new Node(n);
			Node temp=head;
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
		public void median()
		{
			if(head==null)
				return;
			Node temp=head;
			Node slow=temp;
			Node fast=temp.next;
			
			while(fast!=null&&fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
				
			}
			int mid=slow.data;
			if(fast==null)
				System.out.print(slow.data);
			else
				System.out.print(slow.data+" "+slow.next.data);
		}
		
		
}
class Median
{
	public static void main(String[] args)
	{
		LinkedList li=new LinkedList();
		li.insert(6);
		li.insert(7);
		li.insert(8);
		li.insert(1);
		li.insert(3);
		li.insert(9);
		li.median();
	}
}
		