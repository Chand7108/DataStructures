import java.util.*;
 
class KthSmallestElement
{
  static int partition(int arr[],int low,int high)
  {
  	int pivot = arr[high];
  	int i = low;
  	for(int j = low; j < high; j++)
  	{
  		if(arr[j]<=pivot)
  		{
  			int temp = arr[i];
  			arr[i] = arr[j];
  			arr[j] = temp;
  			i++;
  		}
  	}
  	int temp = arr[i];
  	arr[i] = arr[high];
  	arr[high] = temp;
    //System.out.println(i);
  	return i;

  }
  static int quickSelect(int arr[], int low, int high,int k)
  {
  	if( k > 0 && k <= high-low+1)
  	{
  		int pos = partition(arr,low,high);
  		if(pos-low == k - 1)
  			{
                //System.out.println(arr[pos]);
  				return arr[pos];
  			}
  		if(pos-low > k-1)
  			return quickSelect(arr,low,pos-1,k);
  		return quickSelect(arr,pos+1,high,k-pos+low-1);
  	}
  	return 0;
  }
  static int sorting(int arr[],int k)
  {
    Arrays.sort(arr);
    return arr[k-1];
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements in array:");
    int n = in.nextInt();
    System.out.println("Enter the array:");
    int arr[] = new int[n];
    for(int i = 0 ; i < n; i++)
      arr[i] = in.nextInt();
    System.out.println("Enter the K to find Kth smallest element:");
    int k = in.nextInt();
    System.out.println("Enter the method to find the kth smallest method: \n 1.Sorting \n 2. MinHeap \n 3. MaxHeap \n 4. QuickSelect\n");
    int i = in.nextInt();
    int kthSmall = 0;
    switch(i)
    {
      case 1 : kthSmall = sorting(arr,k);
               break;
      case 2 : System.out.println("Yet to do");
               break;
      case 3 : System.out.println("Yet to do");
               break;
      case 4 : kthSmall = quickSelect(arr,0,n-1,k);
               break;
      default : System.out.println("Wrong option");
               System.exit(0);
    }
   System.out.println(k+"th Smallest element in the array is:"+kthSmall);
  }
}