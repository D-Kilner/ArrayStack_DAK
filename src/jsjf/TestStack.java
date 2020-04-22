package jsjf;
import java.util.Arrays;

public class TestStack {

    public static void main(String[] args) {
    	//TestStack shows different functions stack can do.
        ArrayStack<Integer> stack = new ArrayStack<Integer>();

        System.out.println("Testing Stack");
        stack.push(20);
        stack.push(3);
        stack.push(900);
        stack.push(45);
        stack.push(6);
       
        //This stack presents 20 at the top
        System.out.println(stack.peek());

        //removes 20
        stack.pop();
        stack.push(3);
        stack.push(900);
        stack.push(45);
        stack.push(6);

        //The stack shows 3 at the top
        System.out.println(stack.peek());

        //The stack shows 3 being removed from top
        System.out.println(stack.pop());

        //The stack shows 900 at the top
        System.out.println(stack.peek());

        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("The stack contains these numbers:\n" + stack.toString());
        }
    }

