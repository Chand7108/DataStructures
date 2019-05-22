import java.util.*;

class SpanStockProb
{
	static void stackSpan(int arr[], int n, int span[])
	{
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		span[0] = 1;
		for(int i = 1; i < n;i++)
		{
			while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
				stack.pop();
			span[i] = (stack.isEmpty()) ? i+1 : (i-stack.peek());
			stack.push(i);
		}
	}

	static void calculateSpan(int arr[], int n, int span[])
	{
		span[0] = 1;
		for(int i = 1;i < n;i++)
		{
			span[i] = 1;
		for(int j = i-1;j>=0;j--)
		{
			if(arr[i]>=arr[j])
				span[i]++;
		}
		}	
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of days:");
		int n = in.nextInt();
	    System.out.println("Enter the prices for each day:");
	    int arr[] = new int[n];
	    int span[] = new int[n];
		for(int i = 0; i < n;i++)
			arr[i] = in.nextInt();
		System.out.println("Select the method:\n 1. Without stacks\n2.Using stacks\n");
		int k = in.nextInt();
		switch(k)
		{
			case 1 : calculateSpan(arr,n,span);
			         break;
			case 2 : stackSpan(arr,n,span);
			         break;
		}
		//calculateSpan(arr,n,span);
		System.out.println(Arrays.toString(span));

	}
}