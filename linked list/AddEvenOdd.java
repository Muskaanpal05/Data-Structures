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
	public void addEvenOdd()
	{
		int sumEven=0;
		int sumOdd=0;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data%2==0)
			{
				sumEven=sumEven+temp.data;
			}
			else{
				sumOdd=sumOdd+temp.data;
			}
			temp=temp.next;
			
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}
		
}
	
class AddEvenOdd
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
		li.addEvenOdd();
		
	}
}
	