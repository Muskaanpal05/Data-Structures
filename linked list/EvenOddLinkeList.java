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
	public void evenOdd()
	{	
		LinkedList li1=new LinkedList();
		LinkedList li2=new LinkedList();
		Node temp=head;
		Node temp1=temp;
		Node temp2=temp;
		while(temp!=null)
		{
			if(temp.data%2==0)
			{
				if(li1.head==null)
				{
					li1.head=temp;
					temp1=temp;
				}else{
					temp1.next=temp;
					temp1=temp1.next;
				}
			}
			else{
				if(li2.head==null)
				{
					li2.head=temp;
					temp2=temp;
				}
				else{
					temp2.next=temp;
					temp2=temp2.next;
				}
			}
			temp=temp.next;
		}
		temp1.next=null;
		temp2.next=null;
		li1.print();
		li2.print();
				
	}
	public static void print(LinkedList li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
			System.out.println(temp+" "+temp.data+" "+temp.next);
			temp=temp.next;
		}
		System.out.println();
	
	}
		
}
	
class EvenOddLinkedList
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
		li.evenOdd();
		
	}
}
	