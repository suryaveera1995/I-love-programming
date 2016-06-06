import java.util.*;
 
class MatrixAdd
{
   public static void main(String[] args)
   {
      int m,n,i,j;
      Scanner s=new Scanner(System.in);
 
      System.out.println("Enter the range of rows and columns of matrix");
      m=s.nextInt();
      n=s.nextInt();
 
      int first [][]  =  new int[m][n];
      int second[][]  =  new int[m][n];
      int sum   [][]  =  new int[m][n];
 
      System.out.println("Enter the elements in the first matrix");
 
         for (i = 0 ; i < m ; i++)
         for (j = 0 ; j < n ; j++)
         first[i][j] = s.nextInt();
 
      System.out.println("Enter the elements in the second matrix");
 
         for (i = 0 ; i < m ; i++)
         for (j = 0 ; j < n ; j++)
         second[i][j] = s.nextInt();
 
         for (i = 0 ; i < m ; i++)
         for (j = 0 ; j < n ; j++)
         sum[i][j] = first[i][j] + second[i][j];
 
       System.out.println("Sum of the  matrices:");
 
          for (i= 0 ; i < m ; i++)
          {
          for (j = 0 ; j < n ; j++)
       System.out.print(sum[i][j]+"\t");
 
       System.out.println();
      }
   }
}