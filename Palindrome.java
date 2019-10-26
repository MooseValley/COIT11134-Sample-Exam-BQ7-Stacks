// Practice Exam question solution by Mike OMalley.
import java.util.*;

public class Palindrome
{
   public static void main(String[] args)
   {
      String testStr = "Racecar";

      testStr = testStr.toLowerCase();

      Stack<Character> stack = new Stack<Character>();

      for (int k = 0; k < testStr.length(); k++)
      {
         stack.push (testStr.charAt (k) );
      }

      boolean isPalindrome = true;

      for (int k = 0; k < testStr.length() / 2; k++)
      {
         if (testStr.charAt (k) != stack.pop() )
             isPalindrome = false;
      }

      System.out.println (testStr + " is palindrome: " + isPalindrome);
   }
}