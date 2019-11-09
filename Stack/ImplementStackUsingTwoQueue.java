import java.util.*; 

class Stack { 
	Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>(); 
	int size; 
	public Stack() 
	{ 
		size = 0; 
	} 

	void pop() 
	{ 
		if (q1.isEmpty()) 
			return; 

		while (q1.size() != 1) { 
			q2.add(q1.peek()); 
			q1.remove(); 
		} 
		q1.remove(); 
		size--; 

		Queue<Integer> q = q1; 
		q1 = q2; 
		q2 = q; 
	} 

	void push(int x) 
	{ 
		q1.add(x); 
		size++; 
	} 

	int top() 
	{ 
		if (q1.isEmpty()) 
			return -1; 

		while (q1.size() != 1) { 
			q2.add(q1.peek()); 
			q1.remove(); 
		} 
		int temp = q1.peek(); 
		q1.remove(); 
		q2.add(temp); 

		Queue<Integer> q = q1; 
		q1 = q2; 
		q2 = q; 
		return temp; 
	} 

	int size() 
	{ 
		return size; 
	} 
}
class ImplementStackUsingTwoQueue extends Stack{
	public static void main(String[] args) 
	{ 
		Stack s = new Stack(); 
		s.push(1); 
		s.push(2); 
		s.push(3); 
		s.push(4); 
		s.push(5);
		s.push(6);

		System.out.println("size of stack: " + s.size()); 
		System.out.println("element at top "+s.top()+"\nAfter pop() Now:"); 
		s.pop(); 
		System.out.println("element at top "+s.top()); 
		System.out.println("size of stack: " + s.size()); 
	} 
} 

// This code is contributed by Princi Singh 
