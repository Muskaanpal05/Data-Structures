import java.util.*;
class LinkedList{
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static void insertAtEnd(LinkedList li, int n)
	{
		Node newNode=new Node(n);
		if(li.head==null)
		{
			li.head=newNode;
		}
		else
		{
			Node temp=li.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	public static void insertAtBeg(LinkedList li,int n)
	{
		Node newNode=new Node(n);
		if(li.head==null)
		{
			li.head=newNode;
		}
		else{
			Node temp=li.head;
			li.head=newNode;
			newNode.next=temp;
		}
	}
	public static void insertAtAnyPosition(LinkedList li,int position,int n)
	{
		if(position<=1||li.head==null)
		{
			insertAtBeg(li,n);
		}
		else
		{
			int pos=1;
			Node temp=li.head;
			Node newNode=new Node(n);
				while(temp.next!=null && pos<position-1)
				{
					temp=temp.next;
					pos++;
				}
				Node pointer=temp.next;
				temp.next=newNode;
				newNode.next=pointer;
		}
	}
					
			
	public static void print(LinkedList li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
			System.out.println(temp+" "+temp.data+" "+temp.next);
			temp=temp.next;
		}
	}
		
		
	
	public static void main(String[] args)
	{
		LinkedList li=new LinkedList();
		li.head=null;
		insertAtEnd(li,10);
		insertAtEnd(li,15);
		insertAtEnd(li,18);
		insertAtEnd(li,19);
		insertAtEnd(li,29);
		insertAtEnd(li,59);
		insertAtBeg(li,7);
		insertAtAnyPosition(li,3,69);
		insertAtAnyPosition(li,-10,6);
		print(li);
	}
}