import java.util.*;

class PriQueue
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter the number of elements in the list:");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		PriorityQueue<String> q = new PriorityQueue<>();
		System.out.println("Enter the elements:");

		for(int i = 0; i < k; i++)
		{
 			String x = in.nextLine();
 			q.add(x);
		}
		Iterator<String> it = q.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
/*class MyComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		if(s1.compareTo(s2)>0) return 1;
		else if(s1.compareTo(s2)<0 ) return 1;
		else return 0;
	}
}*/