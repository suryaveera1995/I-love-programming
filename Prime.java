import java.util.*;
class Prime
{
     public static void main(String[] args)
     {
       int a=0;
       int b,i,j,k=0;
       
       Scanner s=new Scanner(System.in);
            
       System.out.println("enter the starting number");

       a=s.nextInt();   

       System.out.println("enter the ending number");
       
       b=s.nextInt();
 
       System.out.println("the prime numbers are");

       for(i=a;i<=b;i++)
           {
            
           
            for(j=2;j<i;j++)
              
                {
                 if(i%j==0)
                   
                   {
                    
                    k=0;
                    
                    break;
                   
                   }
                   
                 else
                   
           
                    {
                     
                     k=1;
                    
                    }
                }
           
            if(k==1)
         
                   {
                     
                     System.out.println(i);
                    
                   }
           }
      }
}               
       