package examples;

import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      String pal, word = ""; 
      Scanner string = new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome:");
      pal = string.nextLine();
 
      int length = pal.length();
 
      for ( int x = length - 1; x >= 0; x-- )
         word = word + pal.charAt(x);
 
      if (pal.equals(word))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
 
   }
}	