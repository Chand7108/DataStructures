import java.util.*;

class QuickSort
{
  static int partition(int arr[], int low, int high)
  {
     int pivot = arr[high];
     int i = low-1;
     for(int j = low; j < high; j++)
     {
       if(arr[j] <= pivot)
       {
         i++;
         int temp = arr[i];
         arr[i]= arr[j];
         arr[j] = temp;
        }
      }
      int temp = arr[i+1];
      arr[i+1] = arr[high];
      arr[high] = temp;
      return i+1;
   }
   static void quickSort(int arr[], int low,int high)
   {
     if(low < high)
     {
      int p = partition(arr,low,high);
      quickSort(arr,low,p-1);
      quickSort(arr,p+1,high);
     }
     
   }
   public static void main(String[] args)
   {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = in.nextInt();
    System.out.println("Enter the elements of the array:");
    int arr[] = new int[n];
    for(int i =0;i < n; i++)
      arr[i] = in.nextInt();
     quickSort(arr,0,n-1);
     System.out.println(Arrays.toString(arr));
    }
}
    