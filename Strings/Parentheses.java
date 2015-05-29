/*
 * Parentheses.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
import java.util.Stack;

public class Parentheses
{
   private static final char L_PAREN    = '(';
   private static final char R_PAREN    = ')';
   private static final char L_BRACE    = '{';
   private static final char R_BRACE    = '}';
   private static final char L_BRACKET  = '[';
   private static final char R_BRACKET  = ']';

   public static boolean isBalanced(String str)
   {
      Stack<Character> stack = new Stack<Character>();

      for (int i = 0; i < str.length(); i++)
      {
          // Push the left paren.
          if (str.charAt(i) == L_PAREN)
              stack.push(L_PAREN);

          // Push the left brace.
          else if (str.charAt(i) == L_BRACE)
              stack.push(L_BRACE);

          // Push the left bracket.
          else if (str.charAt(i) == L_BRACKET)
              stack.push(L_BRACKET);

          // If the next item is a right paren, return false if the stack is empty or if the top item is not a right paren.
          else if (str.charAt(i) == R_PAREN)
          {
              if (stack.isEmpty())        return false;
              if (stack.pop() != L_PAREN) return false;
          }

          // If the next item is a right brace, return false if the stack is empty or if the top item is not a right brace.
          else if (str.charAt(i) == R_BRACE)
          {
              if (stack.isEmpty())        return false;
              if (stack.pop() != L_BRACE) return false;
          }

          // If the next item is a right bracket, return false if the stack is empty or if the top item is not a right bracket.
          else if (str.charAt(i) == R_BRACKET)
          {
              if (stack.isEmpty())        return false;
              if (stack.pop() != L_BRACKET) return false;
          }

          // Ignore any other cases.
      }
      return stack.isEmpty();
   }

   public static void main(String[] args) 
   {
      System.out.println(isBalanced("((((()))))"));
      System.out.println(isBalanced("[[[[[[[]]]]]]]"));
      System.out.println(isBalanced("{{{{{{{{{{{{{{}}}}}}}}}}}}}}"));
      System.out.println(isBalanced("({[[{([()])}]]})"));
      System.out.println(isBalanced("())))))))[]]]]]]]]]]]][]]}}{}{}}}}{{}{{{{{{}}}}}}}"));
   }
}
