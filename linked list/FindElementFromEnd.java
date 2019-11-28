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
		public void insert(int d){
			Node temp=head;
			Node newNode= new Node(d);
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
		public int FindElementFromEnd(int a)
		{
			Node temp=head;
			int pos=0;
			Node ptr1=head;
			if(head==null)
			{
				return -1;
			}
			else{
				while(pos<a)
				{
					if(temp==null)
						return -1;
					temp=temp.next;
					pos++;
				}
				Node ptr2=temp;
				while(ptr2!=null)
				{
					ptr1=ptr1.next;
					ptr2=ptr2.next;
				}
				return ptr1.data;
			}
			
		}
			
			
}
class FindElementFromEnd{
	public static void main(String[] args)
	{	Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		LinkedList li=new LinkedList();
		li.insert(2);
		li.insert(3);
		li.insert(5);
		li.insert(1);
		li.insert(8);
		li.insert(9);
		int x=li.FindElementFromEnd(n);
		System.out.print(x);
	}
}
	