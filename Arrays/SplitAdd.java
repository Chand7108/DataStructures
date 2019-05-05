import java.util.Scanner;

class SplitAdd
{
  static void reverseArray(int arr[], int start,int end)
  {
    while(start < end)
    {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
     }
  }
  static void splitArray(int arr[],int n,int k)
  {
    reverseArray(arr,0,n-1);
    reverseArray(arr,0,n-k-1);
    reverseArray(arr,n-k,n-1);
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int n = in.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array:");
    for(int i = 0; i < n; i++)
      arr[i] = in.nextInt();
    System.out.println("Enter the index where you want to split:");
    int k = in.nextInt();
    splitArray(arr,n,k);
    for(int i = 0; i < n; i++)
     System.out.print(arr[i]+" ");
   }
}