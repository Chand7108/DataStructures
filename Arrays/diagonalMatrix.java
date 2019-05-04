import java.io.*;
import java.util.*;
public class diagonalMatrix {
   static  int min(int a, int b)
    {
        return (a < b) ? a : b;
    }
   static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner in = new Scanner(System.in);
        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        int ar[][] = new int[n][m];
        for(int i = 0; i < n;i++)
          for(int j = 0; j < m;j++)
             ar[i][j] = in.nextInt();
        int line =1;
        while(line <= n+m-1){
            int col_num = max(0,line-n);
            int count = min(line,m-col_num);
            for(int i = 0; i < count ; i++)
            System.out.print(ar[min(line,n)-i-1][col_num+i]+" ");
            line++;
            System.out.print("\n");
        }

   }
}
