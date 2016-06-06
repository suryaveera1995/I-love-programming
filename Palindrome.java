import java.util.*;
 
class Palindrome
{
   public static void main(String[] args)
   {
      String name, palin = "";
      Scanner s = new Scanner(System.in);
 
      System.out.println("Enter a string");
      name = s.nextLine();
 
      int length = name.length();
 
      for ( int i = length-1;i>=0;i--)
         {
           palin = palin + name.charAt(i);
         }
 
      if (name.equals(palin))

         {
           System.out.println("Entered string is a palindrome.");
         }
        else
         { 
           System.out.println("Entered string is not a palindrome.");
         }
   }
}