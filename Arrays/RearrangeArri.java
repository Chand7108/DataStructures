import java.util.Scanner;

class RearrangeArri
{
  static void rearrangeArray(int arr[], int n)
  {
    for(int i = 0; i < n;i++)
    {
      if(arr[i] != -1 && arr[i] != i)
      {
        int x = arr[i];
        while(arr[x] != -1 && arr[x] != x)
        {
          int y = arr[x];
          arr[x] = x;
          x = y;
         }
         arr[x] = x;
       if(arr[i] != i)
          arr[i] = -1;
       }
    }
   }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int n = in.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array elements between 0 and n-1 or -1");
    for(int i = 0; i < n; i++)
      arr[i] = in.nextInt();
    rearrangeArray(arr,n);
    for(int i = 0; i < n; i++)
      System.out.print(arr[i]+" "); 
   }
}