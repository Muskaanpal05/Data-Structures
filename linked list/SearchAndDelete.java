import java.util.*;
class SearchAndDelete{
	
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
	public static void insert(SearchAndDelete li, int n)
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
	
	public static Node searchAndDelete(SearchAndDelete li,int value)
	{
		Node temp=li.head;
		while(temp.next!=null)
		{
			if(temp.next.data==value)
			{
				temp.next=temp.next.next;
			}
			else{
				temp=temp.next;
			}
			
		}
		if(li.head.data==value)
		{
			li.head=li.head.next;
		}
		return li.head;
		
	}	
			
	public static void print(SearchAndDelete li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
			System.out.println(temp+" "+temp.data+" "+temp.next);
			temp=temp.next;
		}
		System.out.println();
	
	}
		
		
	
	public static void main(String[] args)
	{
		SearchAndDelete li=new SearchAndDelete();
		li.head=null;
		insert(li,10);
		insert(li,15);
		insert(li,19);
		insert(li,19);
		insert(li,29);
		insert(li,10);
		Scanner sc=new Scanner(System.in);
		int value;
		value=sc.nextInt();
		li.head=searchAndDelete(li,value);
		print(li);
	}
}