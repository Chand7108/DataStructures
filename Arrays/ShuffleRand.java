import java.util.*;

class ShuffleRand
{
  static void shuffleArr(int arr[], int n)
  {
    Random r = new Random();
    for(int i = n-1; i > 0;i--)
    {
      int j = r.nextInt(i+1);
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
     }
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
   shuffleArr(arr,n);
   System.out.println(Arrays.toString(arr));
  }
}