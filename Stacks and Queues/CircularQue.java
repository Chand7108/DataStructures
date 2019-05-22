import java.util.*;

class CircularQue
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the capacity of queue:");
		int capacity = in.nextInt();
	    CircularQueue q = new CircularQueue(capacity);
		int k = 0;
		while(k != 3 )
		{
		System.out.println("Operation to perform :\n1.Enqueue\n2.Dequeue\n3.Exit");
		k = in.nextInt();
		switch(k)
		{
			case 1 : System.out.println("Enter the element to Enqueue:");
					int item = in.nextInt();
					q.enqueue(item);
					break;
			case  2 : System.out.println("Dequeued element:"+q.dequeue());
					break;
			
			
		}

		}
		if(k == 3) System.exit(1);
	}
}
class CircularQueue
{
	private int currentSize;
	private int[] circularq;
	private int maxSize;

	private int rear;
	private int front;

	public CircularQueue(int capacity)
	{
		maxSize = capacity;
		circularq = new int[capacity];
		currentSize = 0;
		front = -1;
		rear = -1;
	}

	public void enqueue(int item)
	{
		if(isFull())
			System.out.println("queue is full");
		else
		{
			rear = (rear+1)% circularq.length;
			circularq[rear] = item;
			currentSize++;
			if(front == -1) front = rear;
		}
		System.out.println(Arrays.toString(circularq));
	}
	public int dequeue()
	{
		int element ;
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else 
		{
			element = circularq[front];
			circularq[front] = -1;
			front = (front+1)%circularq.length;
			currentSize--;
		}
		return element;
	}
	public boolean isFull()
	{
		return (currentSize == circularq.length);
	}
	public boolean isEmpty()
	{
		return (currentSize == 0);
	}
}