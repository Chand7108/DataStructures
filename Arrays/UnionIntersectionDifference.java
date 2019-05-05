import java.util.*;

class UnionIntersectionDifference
{
  static void union(Set<Integer> a, Set<Integer> b)
  {
    a.addAll(b);
    System.out.println("union"+a);
  }
  static void intersection( Set<Integer> a, Set<Integer> b)
  {
    a.retainAll(b);
    System.out.println("intersection"+a);
  }
  static void difference( Set<Integer> a, Set<Integer> b)
  {
    a.removeAll(b);
    System.out.println("difference"+a);
   }

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements in first set:");
    int n = in.nextInt();
    System.out.println("Enter number of elements in second set:");
    int m = in.nextInt();
    Integer arr1[] = new Integer[n];
    Integer arr2[] = new Integer[m];
    System.out.println("Enter the elements for first set:");
    for(int i = 0; i < n ; i++)
     arr1[i] = in.nextInt();
    System.out.println("Enter the elements for second set:");
    for(int i = 0; i < m ; i++)
     arr2[i] = in.nextInt();
    Set<Integer> a = new HashSet<>(Arrays.asList(arr1));
    Set<Integer> b = new HashSet<>(Arrays.asList(arr2));
    union(a,b);
    intersection(a,b);
    difference(a,b);
   }
}
    