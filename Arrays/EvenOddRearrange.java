import java.util.*;

class EvenOddRearrange
{ 
  static void rearrange(int arr[], int n)
  {
    int even = n/2;
    int odd = n - even;
    int temp[] = new int[n];
    for(int i = 0; i < n; i++)
       temp[i] = arr[i];
    Arrays.sort(temp);
    int j =  odd-1;
    for(int i = 0; i < n; i+=2)
    {
        arr[i] = temp[j];
        j--;
     }
    j = odd;
    for(int i =1; i < n; i+=2)
    {
      arr[i] = temp[j];
      j++;
    }
}
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = in.nextInt();
    System.out.println("Enter the elements of array:");
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
       arr[i] = in.nextInt();
    rearrange(arr,n);
    for(int i =0;i<n;i++)
      System.out.print(arr[i]+" ");
    }
}