import java.util.*;
public class RA{
   static final long max = Long.MAX_VALUE;
   static long reverseNumber(long number){
      long rev_number = 0;
      while (number > 0){
         rev_number = rev_number * 10 + number % 10;
         number = number / 10;
      }
      return rev_number;
   }
   static boolean checkPalindrome(long number){
      return (reverseNumber(number) == number);
   }
   static void calculateReverseandAdd(long number){
      long rev_number = 0;
      System.out.println("Palindrome of the given input " + number);
      while (number <= max){
         rev_number = reverseNumber(number);
         number = number + rev_number;
         if (checkPalindrome(number)){
            System.out.println(number);
            break;
         }
         else if (number > max){
            System.out.println("No possible palindromes for the input");
         }
      }
   }
   public static void main(String[] args){
      calculateReverseandAdd(1678);
      calculateReverseandAdd(2961);
      calculateReverseandAdd(202021038);
   }
}