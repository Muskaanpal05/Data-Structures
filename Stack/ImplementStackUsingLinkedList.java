import java.util.*;
	class Stack{
		Node top;
		class Node{
			int data;
			Node next;
			Node(int data)
			{
				this.data=data;
				this.next=null;
			}
		}
		public void push(int d)
		{
			Node newNode= new Node(d);
			Node temp=top;
			if(top==null)
			{
				top=newNode;
			}
			else
			{
				top=newNode;
				newNode.next=temp;
			}
		}
		public void pop()
		{
			Node temp=top;
			if(top==null)
			{
				return;
			}
			else{
				top=temp.next;
			}
		}
		public boolean isEmpty()
		{
			Node temp=top;
			if(top==null)
			{
				return true;
				
			}
			else{
				return false;
			}
		}
		public int top()
		{	
			Node temp=top;
			if(top==null)
			{
				return -1;
			}
			else{
				return top.data;
			}
		}
			
			
		public void print()
		{
			Node temp=top;
			if(top==null)
			{
				return;
			}
			else{
				while(temp!=null)
				{
					System.out.print(temp.data+ " ");
					temp=temp.next;
				}
				System.out.println();
				
			}
		}
		
	}
		
		
		
	class ImplementStackUsingLinkedList
	{
		public static void main(String[] args)
		{
			Stack s1=new Stack();
			s1.push(3);
			s1.push(7);
			s1.push(2);
			s1.push(4);
			s1.push(5);
			s1.pop();
			boolean y=s1.isEmpty();
			int x=s1.top();
			s1.print();
			System.out.println(x);
			System.out.println(y);
		}
	}
			
			
			