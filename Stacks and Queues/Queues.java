import java.util.*;

class QueueArr
{
	int capacity;
	int front,rear,size;
	int arr[];
	public QueueArr(int n)
	{
       capacity = n;
       front = size = 0;
       rear = n-1;
       arr = new int[n];
	}

	boolean isFull(QueueArr queue)
	{
		return (queue.size == queue.capacity);
	}
	boolean isEmpty(QueueArr queue)
	{
		return (queue.size == 0);
	}
	int dequeue()
	{
		int item = arr[front];
		front = (front+1)%capacity;
		size = size - 1;
		return item;
	}
	void enqueue(int k)
	{
		rear = (rear+1)%capacity;
		arr[rear] = k;
		size = size+1;

	}
	int front()
	{
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		return this.arr[this.front];
	}
	int rear()
	{
		if(isFull(this))
			return Integer.MIN_VALUE;
		return this.arr[this.rear];
	}
	void printArr()
	{
		System.out.println(Arrays.toString(arr));
	}
}
class Queues
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the action you want to perform:\n1.Enqueue\n2.Dequeue\n3.Get Rear\n4.Get front\n");
		int k = in.nextInt();
		QueueArr queue = new QueueArr(20);
		switch(k)
		{
			case 1 : if(queue.isFull(queue)){
			            System.out.println("Sorry! Queue is Full!");
						break;}
					else 
					{
						System.out.println("Enter the element to Enqueue");
						int ki = in.nextInt();
						queue.enqueue(ki);
						break;
					}
			case 2 : if(queue.isEmpty(queue))
			  		{
			  			System.out.println("Sorry! Queue is Empty");
			  			break;
			  		}
			  		else
			  		{
			  			System.out.println("Dequeued element is"+queue.dequeue());
			  			break;
			  		}
			case 3 : System.out.println("Element at Rear end:"+queue.rear());
			  		break;
			case 4 : System.out.println("Element at Front end:"+queue.front());
					break;
			default : System.out.println("Wrong option");
			         break;


		}
		queue.printArr();	
	}
}