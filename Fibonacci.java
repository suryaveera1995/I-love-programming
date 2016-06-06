import java.util.*;

class Fibonacci
{

   public static void main(String[] args) 
    {
       Scanner s=new Scanner(System.in);
       
       System.out.println("Enter the value of n ");
       
       int n = s.nextInt();
       
       int a = 0;
       
       int b = 1;
       
       for (int i = 0; i < n; i++) 
           {
               int nextNumber = a + b;
               
               System.out.println(nextNumber + " ");
               
               a = b;
               
               b = nextNumber;
           }
    }
}
