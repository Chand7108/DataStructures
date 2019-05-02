import java.util.Scanner;
class Rotation
{
  void rotateArray(int ar[] , int d, int n)
  {
    for(int i = 0 ; i < d; i++)
     rotateByOne(ar,n);
   }
   
   void rotateByOne(int ar[], int n)
   {
     int temp,i;
     temp = ar[0];
     for(i = 0; i < n-1; i++)
       ar[i] = ar[i+1];
     ar[i] = temp;
    }
   
    void printArray(int ar[] , int n)
    {
      for(int i = 0; i < n; i++)
       System.out.print(ar[i]+" ");
     }
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of elements in the array:");
      int n = in.nextInt();
      int ar[] = new int[n];
      System.out.println("Enter the elements:");
      for(int i = 0; i < n; i++)
        ar[i] = in.nextInt();
      System.out.println("Enter the number of elements to be rotated:");
      int d = in.nextInt();
      Rotation rotate = new Rotation();
      rotate.rotateArray(ar,d,n);
      rotate.printArray(ar,n);
     }
}