import java.util.Scanner;

class SumRotatedSorted
{
   static int findPair(int arr[],int n, int sum)
   {
     int pivot = findPivot(arr,0,n-1);
     System.out.println(pivot);
     int high = pivot;
     int low = pivot+1;
    while(low != high)
    {
     if(arr[low]+arr[high] == sum)
       return 1;
     else if(arr[low]+arr[high] < sum)
          low = (low+1)%n;
     else high = (high+n-1)%n;
     }
     return 0;
    }

    static int findPivot(int arr[], int low,int high)
    {
      if(high < low)
        return -1;
      if(high == low)
        return low;
      int mid = (low+high)/2;
      if(mid < high && arr[mid] > arr[mid+1])
         return mid;
      if(mid > low && arr[mid] < arr[mid-1])
         return mid-1;
      if(arr[low] >= arr[mid])
         return findPivot(arr,low,mid-1);
       return findPivot(arr,mid+1,high-1);
     }

     public static void main(String[] args)
     {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number of elements in the array:");
       int n = in.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter a rotated and sorted array:");
       for(int i = 0; i < n; i++)
          arr[i] = in.nextInt();
       System.out.println("Enter the sum:");
       int sum = in.nextInt();
       int a=findPair(arr,n,sum);
       if(a == 1)
       System.out.println("Found");
       else System.out.println("Not found");
      }
}
      