import java.util.Scanner;

class MaxHam
{
  static int maxHam(int arr[],int n)
  {
    int brr[] = new int[2*n];
    for(int i = 0; i < n; i++)
        brr[i] = arr[i];
    for(int i = 0; i < n; i++)
       brr[i+n] = arr[i];
     /* for(int i = 0; i < 2*n; i++)
        System.out.println(brr[i]); */
      int maxHam = 0;
     for(int i = 1; i < n; i++)
     {
        int currHam = 0;
        for(int j = i,k = 0; j < (n+i) ; j++,k++)
         if(brr[j] != arr[k])
             currHam++;
     
          if(currHam == n)
             return n;
        maxHam = Math.max(maxHam,currHam);
       }
      return maxHam;
    }

   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int arr[] = new int[n];
     for(int i = 0; i < n;i++)
        arr[i] = in.nextInt();
     System.out.println(maxHam(arr,n));
    }
 }