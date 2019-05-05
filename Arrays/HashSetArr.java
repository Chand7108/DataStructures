import java.util.*;

class HashSetArr
{
  static void rearrangeArri(Integer arr[],int n)
  {
    Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
    for(int i = 0; i < n; i++)
    {
      if(set.contains(i))
         arr[i] = i;
      else
         arr[i] = -1;
     System.out.println(arr[i]);
     }
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = in.nextInt();
    Integer arr[] = new Integer[n];
    for(int i = 0; i < n ; i++)
       arr[i] = in.nextInt();
    rearrangeArri(arr,n);
   }
}