import java.util.*; 
class Queue  
{  
    private Stack<Integer> s1 = new Stack<Integer>();  
    private Stack<Integer> s2 = new Stack<Integer>();  
  
    public void push(int x)  
    {  
        while (!s1.isEmpty()) 
        {  
            s2.push(s1.pop());  
        }  
        s1.push(x);  
        while (!s2.isEmpty())  
        {  
            s1.push(s2.pop());    
        }  
    }  
 
    public int pop()  
    {  
        if (s1.isEmpty())  
        {  
            System.out.println("Q is Empty");  
            System.exit(0);  
        }   
        int x = s1.peek();  
        s1.pop();  
        return x;  
    }  
};  
  
class QueueUsingTwoStacks{
	public static void main(String[] args)  
	{  
    		Queue q = new Queue();  
	    	q.push(1);  
    		q.push(2);  
    		q.push(3);  
  
    		System.out.println(q.pop()); 
	}  
}  
  