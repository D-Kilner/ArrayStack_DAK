package jsjf;

import java.util.*;

public class Application {
// the application class calls the class to print the sentence in reverse
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);  
    	boolean testing = true;
    	while(testing) {
              System.out.println("Please Type A Sentence: ");
              String s = scan.nextLine();
              s = reverseString(s);
              System.out.println("The reversed string is: "+ s);
              
              // this prompts the user if they would like to try again
              boolean tryAgain = true;
              while(tryAgain) {
                  System.out.println("Would you like to try again? (Y/N) ");
                  String b = scan.nextLine();
                  if(b.equalsIgnoreCase("y")) {
                      testing = true;
                      tryAgain = false;
                  
                  // this tells the user goodbye and tells the user if the input given is wrong     
                  } else if(b.equalsIgnoreCase("n")) {
                      System.out.println("Goodbye!");
                      testing = false;
                      tryAgain = false;
                  } else {
                      System.out.println("Incorrect Input");
                      tryAgain = true;
          }
              }
          }
      }


    public static String reverseString(String s) {
        if(s == null || s.equals(""))
            return s;

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i< s.length(); i++)
            stack.push(s.charAt(i));

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());

        return sb.toString();
    }
}