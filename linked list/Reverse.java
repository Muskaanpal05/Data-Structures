import java.util.*;
class LinkedList
{
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
	public Node reverse(){

		Node temp=head;
		if(head==null||head.next==null)
		{
			return head;
		}
		while(temp.next!=null)
		{
			Node point=temp.next;
			temp.next=temp.next.next;
			Node temp2=head;
			head=point;
			point.next=temp2;
		}
		return head;		
		
	}
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
	}
}
	
class Reverse
{
	public static void main(String[] args)
	{
		LinkedList li=new LinkedList();
		li.insert(2);
		li.insert(3);
		li.insert(5);
		li.insert(7);
		li.insert(8);
		li.insert(10);
		li.head=li.reverse();
		li.print();
	}
}
	